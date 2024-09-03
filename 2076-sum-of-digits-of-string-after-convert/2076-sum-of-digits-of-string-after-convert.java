class Solution {
    public int getLucky(String s, int k) {
          StringBuilder sol = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int val =  (int)ch - 96;
            sol.append(val);
        }
        
        String result = sol.toString();
       for (int j = 0; j < k; j++) {
            int sum = 0;
            for (char ch : result.toCharArray()) {
                sum += Character.getNumericValue(ch);
            }
            result = Integer.toString(sum);
        }

        return Integer.parseInt(result);
    }
}