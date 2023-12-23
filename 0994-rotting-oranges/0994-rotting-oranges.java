class Solution {
    int n;
    int m;
    public int orangesRotting(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    dfs(i,j,2,grid);// call the function we take 2 min as initial because 0 and 1 are already predefined
                }
            }
        }
        // for finding the total minutes
        int ans=2;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){// some fresh oranges is left so return -1.
                    return -1;
                }
                ans=Math.max(ans,grid[i][j]);
            }
        }
        return ans-2;// because we start with 2min extra at starting

    }
    public void dfs(int i,int j ,int time,int[][]grid){
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]==0){// boundary conditions
            return ;
        }
        if(grid[i][j]>1 && grid[i][j]<time){// its already rotten
            return;
        }
        grid[i][j]=time;
        dfs(i+1,j,time+1,grid);
        dfs(i,j+1,time+1,grid);
        dfs(i-1,j,time+1,grid);
        dfs(i,j-1,time+1,grid);
        return;

    }
}