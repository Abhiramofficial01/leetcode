class Solution {
    public int minDeletions(String s) {
       int freq[] = new int [26];
        int deletions = 0;
        HashSet<Integer> used_frequencies = new HashSet<>();
        
        for (char c : s.toCharArray()) {
            freq[c-'a']++;
        }
        
        for (int val : freq) {
            while (val > 0 && used_frequencies.contains(val)) {
                val--;
                deletions++;
            }
            used_frequencies.add(val);
        }
        
        return deletions;
    }
}