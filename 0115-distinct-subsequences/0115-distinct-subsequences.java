class Solution {
    public int helper(int i,int j, String s,String t,int dp[][]){
         if(j==t.length()){
            return 1;
        }
        if(i==s.length()){
            return 0;
        }
       int myAns;
        if(s.charAt(i)==t.charAt(j)){
            int ans1;
            if(dp[i+1][j+1]!=-1){
                ans1=dp[i+1][j+1];
            }
            else{
                ans1=helper(i+1,j+1,s,t,dp);
                dp[i+1][j+1]=ans1;
            }
            int ans2;
            if(dp[i+1][j]!=-1){
                ans2=dp[i+1][j];
            }
            else{
                ans2=helper(i+1,j,s,t,dp);
                dp[i+1][j]=ans2;
            }
            myAns=ans1+ans2;
        }
        else{
            int ans3;
            if(dp[i+1][j]!=-1){
                ans3=dp[i+1][j];
            }
            else{
                ans3=helper(i+1,j,s,t,dp);
                dp[i+1][j]=ans3;
            }
            myAns=ans3;
        }
        return myAns;
    }
    
    public int numDistinct(String s, String t) {
        int dp[][]=new int[s.length()+1][t.length()+1];
        for(int i=0;i<s.length()+1;i++){
            for(int j=0;j<t.length()+1;j++){
                dp[i][j]=-1;
            }
        }
        int ans=helper(0,0,s,t,dp);
        return ans;
    }

}