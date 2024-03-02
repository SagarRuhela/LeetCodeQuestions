class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList.length==0 || secondList.length==0){
            return new int[0][0];
        }
        int n=firstList.length;
        int m=secondList.length;
      ArrayList<int[][]> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int first1=firstList[i][0];
             int second1=firstList[i][1];
          for(int j=0;j<m;j++){
            int first2=secondList[j][0];
            int second2=secondList[j][1];
            if(first1<=second2 && first2<=second1){
                int arr[][]=new int[1][2];
                arr[0][0]=Math.max(first1,first2);
                arr[0][1]=Math.min(second1,second2);
                list.add(arr);
            }
          
          }
            
        }
        int ans[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
          int arr1[][]=list.get(i);
          ans[i][0]=arr1[0][0];
          ans[i][1]=arr1[0][1];
           
        }
        return ans;
    }
}