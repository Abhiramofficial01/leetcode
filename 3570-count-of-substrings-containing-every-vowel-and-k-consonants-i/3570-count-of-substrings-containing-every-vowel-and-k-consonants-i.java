class Solution {
    String str = "aeiou";
    public int countOfSubstrings(String word, int k) {
        int n = word.length();
        int res = 0;
        for(int i = 0; i < n; i++){
            Set<Character> set = new HashSet<>();
            int consonant = 0;
            for(int j = i; j < n; j++){
                char ch = word.charAt(j);
                if(str.indexOf(ch) != -1){
                    set.add(ch);
                }else{
                    consonant++;
                }  
                if(consonant > k){
                    break;
                }
                if(set.size() == 5 && consonant == k){
                    res++;
                }
            }
        }
        return res;
    }
}