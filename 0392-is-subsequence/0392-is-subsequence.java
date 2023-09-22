class Solution {
 public boolean isSubsequence(String s, String t) {
     int memo[][]=new int[s.length()+1][t.length()+1];
     for(int i=0;i<memo.length;i++){
         for(int j=0;j<memo[i].length;j++){
             memo[i][j]=-1;
         }
     }
     int finalans=solve(s , 0 , t, 0,memo);
     if(finalans==s.length()){
         return true;
     }
     else{
         return false;
     }
    }
    
    private int solve(String s , int i , String t, int j,int memo[][]){
        if(i>=s.length() || j>=t.length()){
            return 0;
        }
        if(memo[i][j]!=-1){
            return memo[i][j];
        }
        if(s.charAt(i) == t.charAt(j)){
            int ans=1+ solve(s,i+1,t,j+1,memo);
            memo[i][j]=ans;
            return ans;
        }else {
            int ans1= solve(s , i, t, j+1,memo);
            int ans2=solve(s,i+1,t,j,memo);
            memo[i][j]=Math.max(ans1,ans2);
            return memo[i][j];
        }
        
    }
}