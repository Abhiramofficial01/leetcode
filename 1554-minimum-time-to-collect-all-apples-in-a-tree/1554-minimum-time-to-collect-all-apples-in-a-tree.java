class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer> >adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList());
        }
        for(int [] k : edges){
            adj.get(k[0]).add(k[1]);//child
            adj.get(k[1]).add(k[0]);//parent        
        }
        return min(0,adj,hasApple,0);
    }
    public int min(int index, List<List<Integer>> adj,List<Boolean> hasApple,int parent){
        int total = 0;
        for(int k : adj.get(index)){
            if(k==parent){
                continue;
            }
            total+= min(k,adj,hasApple,index);
        }
        if(index != 0 && (hasApple.get(index) || total>0)){
            total+=2;
        }
        return total;
    }

}