class Solution {
    public static long helper(int[][] questions,int row,long dp[]){
        if(row>questions.length-1){
            return 0;
        }
    if(dp[row]!=-1){
        return dp[row];
    }
    long ans1=questions[row][0]+ helper(questions, row+ questions[row][1]+1,dp);//take
    long ans2=helper(questions,row+1,dp);//leave
    dp[row]=(int)Math.max(ans1,ans2);
    return Math.max(ans1,ans2);
}
    public long mostPoints(int[][] questions) {
        long dp[]=new long[questions.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        long ans=helper(questions, 0,dp);
        return ans;
    }
}