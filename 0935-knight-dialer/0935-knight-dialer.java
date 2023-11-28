class Solution {
    int mod = 1000000000+7;
    public int knightDialer(int n) {
        long ans=0;
        int memo[][]=new int[n+1][10];

        for(int i=0;i<=9;i++){
            ans=(ans+helper(n-1,i,memo))%mod;
        }
        return (int)ans%mod;
    }
    public int helper(int n,int curr,int[][]memo){
        if(n==0){
            return 1;
        }
        if(curr==5){
            return 0;
        }
        if(memo[n][curr]!=0){
            return memo[n][curr]%mod;
        }
        int ans0=0;
        if(curr==0){
            ans0=(ans0+helper(n-1,4,memo))%mod ;
            ans0=(ans0+ helper(n-1,6,memo))%mod;
        }
        int ans1=0;
         if(curr==1){
            ans1=(ans1+ helper(n-1,8,memo))%mod;
            ans1=(ans1+helper(n-1,6,memo))%mod;
        }
        int ans2=0;
         if(curr==2){
            ans2=(ans2+ helper(n-1,7,memo))%mod;
             ans2=(ans2+helper(n-1,9,memo))%mod;
        }
        int ans3=0;
         if(curr==3){
            ans3=(ans3+ helper(n-1,8,memo))%mod;
             ans3=(ans3+helper(n-1,4,memo))%mod;
        }
         int ans4=0;
         if(curr==4){
            ans4=(ans4+ helper(n-1,9,memo))%mod;
            ans4=(ans4+helper(n-1,3,memo))%mod;
            ans4=(ans4+helper(n-1,0,memo))%mod;
        }
         int ans6=0;
         if(curr==6){
            ans6=(ans6+helper(n-1,0,memo))%mod;
             ans6=(ans6+helper(n-1,1,memo))%mod;
             ans6=(ans6+ helper(n-1,7,memo))%mod;
        }
         int ans7=0;
         if(curr==7){
            ans7=(ans7 + helper(n-1,6,memo))%mod;
               ans7=(ans7+helper(n-1,2,memo))%mod;
        }
         int ans8=0;
         if(curr==8){
            ans8=(ans8 + helper(n-1,1,memo))%mod;
            ans8=(ans8+helper(n-1,3,memo))%mod;
        }
         int ans9=0;
         if(curr==9){
             ans9=(ans9+helper(n-1,2,memo))%mod;
             ans9=(ans9+helper(n-1,4,memo))%mod;}
          int temp=(ans0+ans1+ans2+ans3+ans4+ans6+ans7+ans8+ans9)%mod;
          memo[n][curr]=temp%mod;
          return temp%mod;

         
        
    }
}