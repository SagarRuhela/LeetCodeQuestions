class Solution {
    public int matrixScore(int[][] grid) {
        int n =grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            // here i am checking if first bit is zero or not
            if(grid[i][0]==0){
                flipRow(grid,i);
            }
        }

        for(int i=0;i<m;i++){
            int count=0;// here counting number of zeroes in each column
            for(int j=0;j<n;j++){
                if(grid[j][i]==0){
                    count++;
                }
            }
            if(count>n/2){
                // flip the col
                flipCol(grid,i);
            }

        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans+ binaryToDecimal(grid,i);
        }
        return ans;
    }
    public void flipCol(int grid[][],int col){
        for(int i=0;i<grid.length;i++){
            grid[i][col]=1-grid[i][col];
        }
    }
    public void flipRow(int grid[][],int row){
        for(int i=0;i<grid[0].length;i++){
            grid[row][i]=1-grid[row][i];
        }
    }
    public int binaryToDecimal(int grid[][],int row){
        int ans=0;
        for(int i=0;i<grid[0].length;i++){
            ans=ans*2+grid[row][i];
        }
        return ans;
    }
}