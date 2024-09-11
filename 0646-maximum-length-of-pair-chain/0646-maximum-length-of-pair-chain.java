class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        int count=1;
        int prePointer = 0;
        for(int i=1;i<pairs.length;i++) {
            if(pairs[prePointer][1]<pairs[i][0]) {
                count++;
                prePointer=i;
            }
        }
        return count;
    }
}