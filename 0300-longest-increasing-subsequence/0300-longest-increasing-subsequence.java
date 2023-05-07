class Solution {
     public int helper(int i,int prev,int nums[],int dp[][]){
            if(i>=nums.length){
                return 0;
            }
            if(dp[i][prev+1]!=0){
                return dp[i][prev+1];
            }
            int ans1=Integer.MIN_VALUE;
            if(prev==-1 || nums[prev]<nums[i]){
                ans1=1+helper(i+1,i,nums,dp);
            }
            int ans2=helper(i+1,prev,nums,dp);
            dp[i][prev+1]=Math.max(ans1,ans2);
            return Math.max(ans1,ans2);
            
        }
    public int lengthOfLIS(int[] nums) {
       
        int dp[][]=new int[nums.length+1][nums.length+1];
        int ans= helper(0,-1,nums,dp);
        return ans;
    }
}