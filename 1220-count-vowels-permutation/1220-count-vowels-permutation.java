class Solution {
    int mod=1000000007;
    public int countVowelPermutation(int n) {
        int memo[][]=new int[n+1][180];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<180;j++){
                memo[i][j]=-1;
            }
        }
        long count=0;
        count=(count + helper(1,n,'a', memo))%mod; 
        count=(count + helper(1,n,'e', memo))%mod;
        count=(count + helper(1,n,'i', memo))%mod;
        count=(count + helper(1,n,'u',memo))%mod;
        count=(count + helper(1,n,'o', memo))%mod;
        return (int)count;
 
    }
    public long helper(int size,int n,char prevChar,int dp[][]){
        if(size==n){
            return 1;
        }
        if(dp[size][prevChar]!=-1){
            return dp[size][prevChar];
        }
        long ans=0;
        if(prevChar=='a'){
           ans=(ans+helper(size+1,n,'e',dp))%mod;
        }
        else if(prevChar=='e'){
            ans=(ans+helper(size+1,n,'a',dp))%mod;
            ans=(ans+ helper(size+1,n,'i',dp))%mod;
        }
        else if(prevChar=='o'){
            ans=(ans+helper(size+1,n,'u',dp))%mod;
            ans=(ans+ helper(size+1,n,'i',dp))%mod;
        }
        else if(prevChar=='u'){
             ans=(ans+helper(size+1,n,'a',dp))%mod;
        }
        else{
            ans=(ans+helper(size+1,n,'a',dp))%mod;
            ans=(ans+ helper(size+1,n,'e',dp))%mod;
             ans=(ans+helper(size+1,n,'o',dp))%mod;
            ans=(ans+ helper(size+1,n,'u',dp))%mod;
        }
        dp[size][prevChar]=(int)ans;
        return ans;
    }
}