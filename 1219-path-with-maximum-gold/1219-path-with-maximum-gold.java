class Solution {
    public int getMaximumGold(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int result=0;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    int ans=helper(i,j,visited,grid);
                     result=Math.max(result,ans);
                }
            }
        }
        return result;
    }
    public int helper(int i,int j, boolean visited[][],int grid[][]){
        if(i>grid.length-1 || j>grid[0].length-1 || i<0 || j<0 || visited[i][j] || grid[i][j]==0){
            return 0;
        }
        visited[i][j]=true;
        int ans1=grid[i][j] + helper(i+1,j,visited,grid);
        int ans2=grid[i][j] + helper(i,j+1,visited,grid);
        int ans3=grid[i][j] + helper(i-1,j,visited,grid);
        int ans4=grid[i][j] + helper(i,j-1,visited,grid);
        visited[i][j]=false;
        return Math.max(ans1,Math.max(ans2,Math.max(ans3,ans4)));
    }
}