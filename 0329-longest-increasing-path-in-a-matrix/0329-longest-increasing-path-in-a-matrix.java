class Solution {
    int memo[][];
    public int longestIncreasingPath(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        memo=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                memo[i][j]=-1;
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                   ans=Math.max(ans,dfs(i,j,matrix,-1));
            }
        }
        return ans;
    }
    public int dfs(int i, int j , int matrix[][],int prev){
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length || prev>= matrix[i][j]){
            return 0;
        }
        if(memo[i][j]!=-1){
            return memo[i][j];
        }
        int left =1+dfs(i-1,j,matrix,matrix[i][j]);
        int right=1+ dfs(i+1,j,matrix,matrix[i][j]);
        int up=1+ dfs(i,j+1,matrix,matrix[i][j]);
        int down=1+dfs(i,j-1,matrix,matrix[i][j]);
        return memo[i][j]=Math.max(Math.max(left,right),Math.max(up,down));
    }
}