class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, longest = 0, cur = 0;
        for (int num : nums) {
            if  (num > max) {
                max = num;
                longest = cur=0;
            }
            cur = num == max ? ++cur : 0;
            longest = Math.max(longest, cur);
        }
        return longest;
    }
}