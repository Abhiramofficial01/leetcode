class Solution {
    public int maxScore(String s) {
        int score=0,ones=0,zeroes=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='1'){
                ones--;
            }
            else{
                zeroes++;
            }
            int count=zeroes+ones;
            score=Math.max(score,count);
        }
        return score;
    }
}