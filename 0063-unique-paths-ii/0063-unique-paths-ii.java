class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int dp[][]=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j]=-1;
            }
        }
        return helper(0,0,obstacleGrid,dp);
    }
    public int helper(int i,int j,int[][] obstacleGrid,int dp[][]){
        if(i>=obstacleGrid.length || j>=obstacleGrid[0].length){
            return 0;
        }
        if(obstacleGrid[i][j]==1){
            return 0;
        }
        if(i==obstacleGrid.length-1 && j==obstacleGrid[0].length-1 && obstacleGrid[i][j]==0){
            return 1;
        }
      
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right=helper(i,j+1,obstacleGrid,dp);
        int down=helper(i+1,j,obstacleGrid,dp);
        
        dp[i][j]=right+ down;
        return dp[i][j];
    }
}