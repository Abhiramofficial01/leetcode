class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long res=0,sum=0;
        for(int a:nums){
            res+=sum;
            sum=Math.max(sum,a);
        }
        return res;
    }
}