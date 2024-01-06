class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
       int n=startTime.length;
        int[][] jobs = new int[n][3];
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        for (int i = 0; i < n; i++) {
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }

       Arrays.sort(jobs, (a, b)->a[0] - b[0]);
        int ans=helper(0,dp,jobs);
        return ans;
    }
    public int helper(int idx,int dp[],int jobs[][] ){
        if(idx>=jobs.length){
            return 0;
        }
        if(idx==jobs.length-1){
            return jobs[idx][2];
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int newIdx=findIndex(idx,jobs);
        int lenaHai=jobs[idx][2]+helper(newIdx,dp,jobs);
        int nhiLena=helper(idx+1,dp,jobs);
        dp[idx]=Math.max(lenaHai,nhiLena);
        return dp[idx];
    }
    public int findIndex(int idx,int[][]jobs){
        int temp=jobs[idx][1];
        for(int i=idx+1;i<jobs.length;i++){
            if(jobs[i][0]>=temp){
                return i;
            }
        }
        return jobs.length+1;
    }
}