class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
          int n=grid.length;
        int m=grid[0].length;
        int oneRa[]=new int[n];
        int zeroRa[]=new int[n];
        int oneCa[]=new int[m];
        int zeroCa[]=new int[m]; 
        for(int i=0;i<n;i++){
         int oneR=0;
         int zeroR=0;
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    oneR++;
                }
                else{
                    zeroR++;
                }
            }
            oneRa[i]=oneR;
            zeroRa[i]=zeroR;
        }
        for(int i=0;i<m;i++){
        int oneC=0;
        int zeroC=0;
            for(int j=0;j<n;j++){
                if(grid[j][i]==1){
                    oneC++;
                }
                else{
                    zeroC++;
                }
            }
            oneCa[i]=oneC;
            zeroCa[i]=zeroC;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=oneRa[i]+oneCa[j]-zeroRa[i]-zeroCa[j];
            }
        }
        return grid;
        
    }
}