class Solution {
    public static int helper(int nums1[],int nums2[]){
        int n=nums1.length;
        int m=nums2.length;
        int dp[][]=new int[n+1][m+1];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(nums1[i]==nums2[j]){
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
            
        }
        return dp[0][0];
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int ans=helper(nums1,nums2);
        return ans;
    }
}