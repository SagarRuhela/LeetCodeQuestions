class Solution {
    public String longestPalindrome(String s) {
       int n=s.length();
       boolean dp[][]=new boolean[n][n];
       int end=0;
       int start=0;
       for(int i=0;i<n;i++){
           for(int j=i;j>=0;j--){
               boolean ans;
               if(s.charAt(i)==s.charAt(j)){
                   ans=true;
               }
               else{
                   ans=false;
               }
               if(i==j){
                   dp[i][j]=true;
               }
               else if(i-j==1){
                   dp[i][j]=ans;
               }
               else if(ans && dp[i-1][j+1]){
                   dp[i][j]=true;               }
           if(dp[i][j] && i-j>end-start){
               end=i;
               start=j;
           }
           }
       }
       return s.substring(start,end+1); 
    }
}