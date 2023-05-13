class Solution {
    int n=1000000007;
     int dp[];
    public int  helper(int low,int high,int zero,int one,int strlen,int dp[]){
         if(strlen>high){
             return 0;
         }
         if(dp[strlen]!=-1){
             return dp[strlen];
         }
         int ans1,ans2;
         if(strlen+ zero>=low && strlen+zero<=high){// for zero 
             ans1= (1+helper(low,high,zero,one,strlen+zero,dp))%n;   
         }
         else{
             ans1= helper(low,high,zero,one,strlen+zero,dp)%n;
         }
         if(strlen+one>=low && strlen+one<=high){
             ans2=(1+helper(low,high,zero,one,strlen+one,dp)%n);// for one
         }
         else{
            ans2=helper(low,high,zero,one,strlen+one,dp)%n; 
         }
         dp[strlen]=(ans1+ans2)%n;
         return (ans1+ ans2)%n;
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
       dp=new int[high+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        int ans=helper(low,high,zero,one,0,dp)%n;
        return ans%n;
    }
}