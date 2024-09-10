class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n=timeSeries.length;
        int res=0;
        for(int i=0;i<n-1;i++){
            if(timeSeries[i+1]<=timeSeries[i]+duration-1){
                res+=timeSeries[i+1]-timeSeries[i];
            }
            else{
                res+=duration;
            }
        }
        res+=duration;
        return res;
    }
}