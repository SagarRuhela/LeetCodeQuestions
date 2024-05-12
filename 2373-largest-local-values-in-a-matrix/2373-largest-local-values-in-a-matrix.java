class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int ans[][]=new int[n-2][n-2];
        int arr[][]=new int[n][n];
        for(int i=0;i<n-2;i++){
           for(int j=0;j<n-2;j++){
            int as=findMax(i,j,grid);
            ans[i][j]=as;
           }
        }
       return ans;

    }
    public int findMax(int i,int j,int[][] grid){
        int max=0;
        for(int in=i;in<i+3;in++){
            for(int jn=j;jn<j+3;jn++){
                max=Math.max(max,grid[in][jn]);
            }
        }
        return max;

    }
}