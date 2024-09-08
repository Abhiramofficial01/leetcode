class Solution {
    public int maxPossibleScore(int[] start, int d) {
        Arrays.sort(start);
        long l = 0;
        long r =Integer.MAX_VALUE;
        int n = start.length;
        while(l <= r) {
            long m = (l+r)/2;
            long prev = start[0];
            boolean can = true;
            for(int i = 1; i < n; i++) {
                long next = prev + m;
                if(next > start[i]+d) {
                    can = false;
                    break;
                } else {
                    prev = Math.max(next, start[i]);
                }
            }
            if(can) l = m+1;
            else r = m-1;
        }
        return (int) (l-1);
    }
}