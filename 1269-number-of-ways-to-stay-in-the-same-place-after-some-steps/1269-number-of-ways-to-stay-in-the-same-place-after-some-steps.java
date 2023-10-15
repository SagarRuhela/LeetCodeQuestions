class Solution {
    int memo[][];
    public int numWays(int steps, int arrLen) {
        arrLen = Math.min(steps, arrLen);
         this.memo=new int[steps+1][arrLen+1];
        for(int i=0;i<steps+1;i++){
            for(int j=0;j<arrLen+1;j++){
                memo[i][j]=-1;
            }
        }
        int ans=helper(0,steps,arrLen);
        return ans;
    }
    public int helper(int idx,int steps,int arrLen){
        if(idx>=arrLen || idx<0){
            return 0;
        }
        if(steps==0){
            if(idx==0){
            return 1;
            }
            else{
                return 0;
            }
        }
        
        if(steps<0){
            return 0;
        }
        if(memo[steps][idx]!=-1){
            return memo[steps][idx];
        }
        int ans=0;
        ans=(ans+helper(idx+1,steps-1,arrLen))%1000000007;
        ans=(ans+helper(idx-1,steps-1,arrLen))%1000000007;
        ans=(ans+helper(idx,steps-1,arrLen))%1000000007;
       memo[steps][idx]=ans;
        return ans;
    }
}