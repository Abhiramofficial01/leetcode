class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, ans = 0, cnt =0;
        for (var n :nums) {
            if ( n== max) {
                ans = Math.max(ans, ++cnt);
            } else if (n > max) {
                max = n;
                ans = cnt = 1;
            } else {
                cnt = 0;
            }
        }
        return ans;
    }
}