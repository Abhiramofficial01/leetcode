class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int maxi=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi+=1;
            }
        }
        return maxi;
    }
}