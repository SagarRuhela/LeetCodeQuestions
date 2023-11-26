class Solution {
    public int largestSubmatrix(int[][] matrix) {
        // first find the height of the matrix so that we can find the largest area
        // so now first we have to modify the arr according to the consecutive rows
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    matrix[i][j]=matrix[i][j]+matrix[i-1][j];
                }
            }
        }
        for(int rows[]:matrix){
            Arrays.sort(rows);

        }
        int ans=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=matrix[0].length-1,k=1;j>=0;j--,k++){
                 if(matrix[i][j]!=0){
                     int temp=matrix[i][j]*k;
                     ans=Math.max(ans,temp);
                 }
                 else{
                     break;
                 }
            }
        }
        return ans;

    }
}