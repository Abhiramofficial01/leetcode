class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int c=0, r=0, o=0, a=0;
        int max =0;

        for(char ch:croakOfFrogs.toCharArray()){
            if(ch=='c'){
                c++;
            } else if(ch=='r'){
                if(c < ++r) return -1;
            } else if(ch=='o'){
                if(r < ++o) return -1;
            } else if(ch == 'a'){
                if(o < ++a) return -1;
            } else{
                max = Math.max(max, c--);
                o--;
                r--;
                a--;
            }
        }
        return (c==0 && r==0 && o==0 && a==0 )?max:-1;
    }
}