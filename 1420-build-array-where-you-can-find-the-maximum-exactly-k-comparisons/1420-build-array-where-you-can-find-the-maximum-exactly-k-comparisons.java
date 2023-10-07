class Solution {
    int memo[][][]=new int[50+1][100+1][50+1];
    public int helper(int n,int m,int k,int idx,int lar, int currLenToK){
        if(idx==n){
            if(currLenToK==k){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(memo[idx][lar][currLenToK]!=-1){
            return memo[idx][lar][currLenToK]; 
        }
            int ans=0;
            for(int i=1;i<=m;i++){
                if(i>lar){
                    ans=(ans+ helper(n,m,k,idx+1,i,currLenToK+1))%1000000007;
                }
                else{
                    ans=(ans+ helper(n,m,k,idx+1,lar,currLenToK))%1000000007;
                }
                if(currLenToK>k){
                    break;
                }
            }
        return memo[idx][lar][currLenToK]=ans;
    }
    public int numOfArrays(int n, int m, int k) {
        for(int i=0;i<51;i++){
            for(int j=0;j<101;j++){
                for(int z=0;z<51;z++){
                    memo[i][j][z]=-1;
                }
            }
        }
        int ans1=helper(n,m,k,0,0,0);
        return ans1;
    }
}