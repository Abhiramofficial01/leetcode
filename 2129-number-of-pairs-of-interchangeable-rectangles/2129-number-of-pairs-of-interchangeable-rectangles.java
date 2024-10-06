class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long n = rectangles.length,res=0;
        Map<Double,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            double ratio = (double) rectangles[i][0] / rectangles[i][1];
            res = res + hm.getOrDefault(ratio,0);
            hm.put(ratio,hm.getOrDefault(ratio,0)+1);
        }
        return res;
    }
}