class Solution {
    public static int helper(String s1, String s2){
        int n=s1.length();
        int dp[][]=new int[n+1][n+1];
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    int ans1=dp[i+1][j];
                    int ans2=dp[i][j+1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[0][0];
        
    }
    public int minInsertions(String s) {
        String s1="";
        for(int i=0;i<s.length();i++){
            s1=s.charAt(i)+s1;
        }
        int ans=helper(s,s1);
        return s.length()-ans;
    }
}