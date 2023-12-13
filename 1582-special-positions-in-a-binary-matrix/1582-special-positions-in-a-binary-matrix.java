class Solution {
    public int numSpecial(int[][] mat) {
       int rows[]=new int[mat.length];
       int col[]=new int[mat[0].length];
     
       for(int i=0;i<mat.length;i++){
            int sum = 0;
            for(int j=0;j<mat[0].length;j++){
                sum=sum+mat[i][j];
            }
            rows[i]=sum;
       }
       for(int j=0;j<mat[0].length;j++){
           int sum=0;
           for(int k=0;k<mat.length;k++){
               sum=sum+mat[k][j];
           }
           col[j]=sum;
       }
       int count=0;
       for(int j=0;j<mat.length;j++){
           for(int k=0;k<mat[0].length;k++){
               if(mat[j][k]==1){
                   if(rows[j]==col[k] & rows[j]==1){
                       count++;
                   }
               }
           }
       }
       return count; 
    }
}