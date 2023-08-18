class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int totalroads[]=new int[n];
        boolean arr[][]=new boolean[n][n];
        
        for(int i=0;i<roads.length;i++){
             totalroads[roads[i][0]]++;
             totalroads[roads[i][1]]++;
             arr[roads[i][0]][roads[i][1]]=true;
              arr[roads[i][1]][roads[i][0]]=true;
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              int maxtillnow=totalroads[i]+totalroads[j];
              if(arr[i][j]){
                  maxtillnow--;
              }
              max=Math.max(max,maxtillnow);
            }
        }
        return max;
    }
}