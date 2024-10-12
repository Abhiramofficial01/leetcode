class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
     int n = nums.size();
        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            
            int minimalAns = Integer.MAX_VALUE;
            boolean flag = false;
            for (int bit = 0; bit < 31; bit++) {
                if (((num >> bit) & 1) == 1) {
                    int bit_ = num & ~(1 << bit);
                    if (bit_ < 0) {
                        continue;
                    }

                    if ((bit_ | (bit_ + 1)) == num) {
                        if (bit_ < minimalAns) {
                            minimalAns = bit_;
                            flag = true;
                        }
                    }
                }
            }

            if (flag) {
                ans[i] = minimalAns;
            } else {
                ans[i] = -1;
            }
        }

        return ans;
    }
}