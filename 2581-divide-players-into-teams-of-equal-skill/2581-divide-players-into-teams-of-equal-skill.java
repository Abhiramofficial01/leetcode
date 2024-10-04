class Solution {
    public long dividePlayers(int[] skill) {
         Arrays.sort(skill);
        int n = skill.length;
        int totalSkill = skill[0] + skill[n - 1]; 
        long chemistrySum = 0;
        for (int i = 0; i < n / 2; i++) {
            int left = skill[i];            
            int right = skill[n - 1 - i];   
            if (left + right != totalSkill) {
                return -1;
            }
            chemistrySum += (long) left * right;
        }
        return chemistrySum;
    }
}