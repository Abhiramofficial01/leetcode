class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
         int n = queries.length, j = 0;
        int[] res = new int[n];
        for (int i = 1; i < arr.length; i++)
            arr[i]^=arr[i-1];
        for (int[] q : queries)
            res[j++] = (q[0] == 0 ? arr[q[1]] : arr[q[0] - 1] ^ arr[q[1]]);
        return res;
    }
}