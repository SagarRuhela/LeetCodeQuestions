class Solution {
   
    public int uniquePathsIII(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean visited[][]=new boolean[n][m];
         int count=1;
         int x=0; 
         int y=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                 x=i;
                 y=j;
                }
                else if(grid[i][j]==0){
                    count++;
                }
            }
        }
        int answer=helper(x,y,grid,count);
        return answer;
    }
    public int  helper(int i,int j , int grid[][], int count){
        if(i<0 || j<0 ||i>=grid.length || j>=grid[0].length  || grid[i][j]==-1){
            return 0;
        }
        
        if(grid[i][j]==2){
            if(count==0){
            return 1;
            }
            else{
                return 0;
            }
        }
        grid[i][j]=-1; 
       int ans= helper(i-1,j,grid,count-1)+ helper(i+1,j,grid,count-1) + helper(i,j+1,grid,count-1)+ helper(i,j-1,grid,count-1);
       grid[i][j]=0;
       return ans;
        
        
    }
}