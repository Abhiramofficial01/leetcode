class Solution {
    public int similarPairs(String[] words) {
            HashMap<String, Integer> hashMap = new HashMap<>();
        int counter = 0;
        for (String word : words) {
            String sortedString = this.removeDuplicatesAndSort(word);
            hashMap.merge(sortedString, 1, Integer::sum);
        }
        for (Integer value : hashMap.values()) {
            if (value > 1) {
                counter = counter + value*(value-1)/2;
            }
        }
        return counter;
    }

    public static String removeDuplicatesAndSort(String str) {
        char[] charArray = str.toCharArray();
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char c : charArray) {
            uniqueChars.add(c);
        }
        Character[] sortedCharArray = uniqueChars.toArray(new Character[0]);
        char[] result = new char[sortedCharArray.length];
        for (int i = 0; i < sortedCharArray.length; i++) {
            result[i] = sortedCharArray[i];
        }
        Arrays.sort(result);
        return new String(result);
   }
}