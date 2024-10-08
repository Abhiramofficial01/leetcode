class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<Integer>[] adj = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for(int i = 0; i < manager.length; i++) {
            if(i != headID) {
                adj[manager[i]].add(i);
            }
        }

        return traverse(headID, adj, informTime);
    }

    private int traverse(int curr, List<Integer>[] adj, int[] informTime) {
        if(adj[curr].size() == 0) {
            return 0;
        }

        int longest = 0;
        for(int child : adj[curr]) {
            longest = Math.max(longest, traverse(child, adj, informTime));
        }

        return informTime[curr] + longest;
    }
}