class Solution {
    public int totalCombinations=0;// for counting the combination
    public int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j]=-1;
            }
        }
       int ans= helper(amount,coins,0,dp);
        return ans;
        
    }
    public int helper(int amount,int[] coins,int index,int dp[][]){
        if(amount==0){
            return 1;
        }
        if(index==coins.length){
            return 0;
        }
        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }
        if(coins[index]>amount){
            dp[index][amount]=helper(amount,coins,index+1,dp);
            return dp[index][amount];
        }
        dp[index][amount]=helper(amount-coins[index],coins,index,dp) + helper(amount,coins,index+1,dp);
        return dp[index][amount];
        
    }
}