class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
       
        double memo[][]=new double[101][101];
        for(int i=0;i<memo.length;i++){
            for(int j=0;j<memo.length;j++){
                memo[i][j]=-1;
            }

        }
        double ans=helper(poured,query_row,query_glass,memo);
        return Math.min(1.00,ans);
    }
    public double helper(int poured,int row,int col,double memo[][]){
        if(row<0 || col<0 ){
            return 0.00;
        }
        if(row==0 && col==0){
            return poured;
        }
        if(memo[row][col]!=-1){
            return memo[row][col];
        }
        double left=(helper(poured,row-1,col-1,memo)-1)/2;// for every left cup filling its child cup its row and col is different 
        if(left<0.00){
            left=0.00;
        }
        double right=(helper(poured,row-1,col,memo)-1)/2;// for every right fillig it lower cup its column is same 
        if(right<0.00){
            right=0.00;
        }

       return memo[row][col]=left + right;
    }
}