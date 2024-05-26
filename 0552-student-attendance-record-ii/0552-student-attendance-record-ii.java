class Solution {
    Integer memo[][][];
    int mod=1000000007;
    public int checkRecord(int n) {
        this. memo=new Integer[3][4][n+1];
        int ans=helper(0,0,0,n)%mod;
        return ans%mod;
    }
    public int helper(int ab,int late, int idx,int n){
        if(ab>1 || late>=3){
            return 0;
        }
        if(idx>=n){
            return 1;
        }
        if(memo[ab][late][idx]!=null){
            return memo[ab][late][idx]%mod;
        }
        
       int ans1=(helper(ab+1,0,idx+1,n))%mod;
       int ans2=(helper(ab,late+1,idx+1,n))%mod;
       int ans3=(helper(ab,0,idx+1,n))%mod;
       int total=((ans1+ans2)%mod + ans3)%mod;
       memo[ab][late][idx]=total;
       return total;

    }
}