class SummaryRanges {
    private final TreeMap<Integer, Integer> intervals;

    public SummaryRanges() {
        this.intervals = new TreeMap<>();
    }
    
    public void addNum(int value) {
        if(intervals.containsKey(value)) {
            return;
        }

        Integer low = intervals.floorKey(value);
        Integer high = intervals.ceilingKey(value + 1);

        if(low != null && intervals.get(low) >= value - 1) {
            intervals.put(low, Math.max(intervals.get(low), value));

            if(high != null && intervals.get(low) + 1 >= high) {
                intervals.put(low, intervals.get(high));
                intervals.remove(high);
            }
        } else if(high != null && high == value + 1) {
                intervals.put(value, intervals.get(high));
                intervals.remove(high);
        } else {
            intervals.put(value, value);
        }
    }
    
    public int[][] getIntervals() {
        List<int[]> returnValue = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : intervals.entrySet()) {
            returnValue.add(new int[] {
                entry.getKey(),
                entry.getValue()
            });
        }

        return returnValue.toArray(new int[returnValue.size()][]);
    }
}