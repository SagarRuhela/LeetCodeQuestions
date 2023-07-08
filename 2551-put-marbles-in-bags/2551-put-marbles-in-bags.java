class Solution {
    public long putMarbles(int[] weights, int k) {
        if(k==weights.length){
            return 0;
        }
        int n=weights.length;
        int arr[]=new int[n-1];
        for(int i=1;i<n;i++){
            arr[i-1]=weights[i]+weights[i-1];
        }
        Arrays.sort(arr);
        long ans=0;
        for(int i=0;i<k-1;i++){
           
           ans= ans+ arr[n-i-2]-arr[i];
        }
      return ans;
    }
}