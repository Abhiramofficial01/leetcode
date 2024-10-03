class Solution {
    public int[] divisibilityArray(String word, int m) {
     int n = word.length();
    int[] div = new int[n];
    long num = 0;
    for (int i = 0; i < n; i++) {
        long digit = word.charAt(i) - '0';
        num = (num * 10 + digit) % m;
        div[i] = (num == 0) ? 1 : 0;
    }
    return div;
    }
}