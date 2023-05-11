class Solution {
    public static int Helper(int i,int j,int nums1[],int nums2[],int dp[][]){
        if(i>=nums1.length || j>=nums2.length){
            return 0;
        }
        int finalAns;
        if(nums1[i]==nums2[j]){
            int ans;
            if(dp[i+1][j+1]!=-1){
             ans=dp[i+1][j+1];
            }
             else{
                 ans=Helper(i+1,j+1,nums1,nums2,dp);
                 dp[i+1][j+1]=ans;
               }
               finalAns=ans+1;
            
        }
        else{
            int ans1;
            int ans2;
            if(dp[i][j+1]!=-1){
                ans1=dp[i][j+1];
            }
            else{
                ans1=Helper(i,j+1,nums1,nums2,dp);
                dp[i][j+1]=ans1;
            }
            if(dp[i+1][j]!=-1){
                ans2=dp[i+1][j];
            }
            else{
                ans2=Helper(i+1,j,nums1,nums2,dp);
                dp[i+1][j]=ans2;
            }
            finalAns=Math.max(ans1,ans2);
            
        }
            return finalAns;
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int dp[][]=new int[nums1.length+1][nums2.length+1];
        for(int i=0;i<nums1.length+1;i++){
            for(int j=0;j<nums2.length+1;j++){
                dp[i][j]=-1;
            }
        }
        int ans=Helper(0,0,nums1,nums2,dp);
        return ans;
    }
}