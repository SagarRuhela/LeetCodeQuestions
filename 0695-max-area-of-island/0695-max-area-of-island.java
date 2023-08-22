class Solution {
    int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
		int n=grid.length;
		int m=grid[0].length;
		int visited[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(visited[i][j]==0) {
					count=0;
					ans=Math.max(ans, dfs(grid, i, j,visited));
				}
			}
		}
		return ans;
    }
    public  int dfs(int grid[][],int i,int j,int visited[][]) {
		if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j]==1 || grid[i][j]==0) {
			return 0;
		}
		if(visited[i][j]==0 && grid[i][j]==1) {
			count++;
		}
		visited[i][j]=1;
		dfs(grid,i+1,j,visited);
		dfs(grid,i-1,j,visited);
		dfs(grid,i,j+1,visited);
		dfs(grid,i,j-1,visited);
		return count;
	}
}