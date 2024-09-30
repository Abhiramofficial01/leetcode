class Solution {
    boolean isVowel(int a) {
        if (a == ('a' - 'a') || a == ('e' - 'a') || a == ('i' - 'a') || a == ('o' - 'a') || a == ('u' - 'a')) {
            return true;
        }
        return false;
    }

    boolean checkAllVowel(int count[]) {
        for (int i = 0; i < 26; i++) {
            if (isVowel(i) && count[i] < 1) {
                return false;
            }
        }
        return true;
    }

    public long countOfSubstrings(String word, int k) {
        char c[] = word.toCharArray();
        int left = 0;
        int n = c.length;

        int count[] = new int[26]; 
        int kCount = 0;      

        int lastConso[] = new int[n]; 
        int prev = -1; 

        long ans = 0; 
        for (int i = 0; i < n; i++) {
            lastConso[i] = prev;
            if (!isVowel(c[i] - 'a')) {
                prev = i;
            }
        }

        for (int i = 0; i < n; i++) {
            int cur = c[i] - 'a';
            if (isVowel(cur)) {
                count[cur]++;
            } else {
                kCount++;
            }
            while (kCount > k && left < i) {
                int leftVal = c[left] - 'a';

                if (isVowel(leftVal)) {
                    count[leftVal]--;
                } else {
                    kCount--;
                }
                left++;
            }
            while (true) {
                int leftVal = c[left] - 'a';
                if (!isVowel(leftVal)) {
                    break;
                }

                if (count[leftVal] > 1) {
                    count[leftVal]--;
                    left++;
                    continue;
                }
                break;
            }

            if (kCount == k && checkAllVowel(count)) {
                int curAns = (left - lastConso[left]); 
                ans = ans + curAns;
            }
        }

        return ans;
    }
}