class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int dp[][]=new int [n][m];
        int ans1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans1=Math.max(ans1,nums1[i]*nums2[0]);
            dp[i][0]=ans1;
        } 
        int ans2=Integer.MIN_VALUE;
         for(int i=0;i<m;i++){
            ans2=Math.max(ans2,nums1[0]*nums2[i]);
            dp[0][i]=ans2;
        } 
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                int ans=nums1[i]*nums2[j];
                ans=Math.max(ans,ans+dp[i-1][j-1]);
                int max=Math.max(dp[i][j-1],dp[i-1][j]);
                ans=Math.max(ans,max);
                dp[i][j]=ans;
            }
        }
        return dp[n-1][m-1];
    }
}