class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int pacific[][]=new int[n][m];
        int atlantic[][]=new int[n][m];
        for(int i=0;i<m;i++){
              dfs(0,i,pacific,heights[0][i],heights);
              dfs(n-1,i,atlantic,heights[n-1][i],heights);
        }
         for(int i=0;i<n;i++){
              dfs(i,0,pacific,heights[i][0],heights);
              dfs(i,m-1,atlantic,heights[i][m-1],heights);
        }
       List<List<Integer>> ans=new ArrayList<>();
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(pacific[i][j]==1 && atlantic[i][j]==1){
                   List<Integer> temp=new ArrayList<>();
                   temp.add(i);
                   temp.add(j);
                   ans.add(temp);
               }
           }
       }
       return ans;

    }
    public void dfs(int row,int col, int visited[][],int prevHeight,int heights[][]){
        if(row<0 || row>=heights.length || col<0 || col>=heights[0].length || heights[row][col]
        < prevHeight){
            return;
        }
        if(visited[row][col]==1){
            return;
        }
        visited[row][col]=1;
        dfs(row+1,col,visited,heights[row][col], heights);
        dfs(row,col+1,visited,heights[row][col], heights);
        dfs(row-1,col,visited,heights[row][col], heights);
        dfs(row,col-1,visited,heights[row][col], heights);
    }
}