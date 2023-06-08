class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int [] row:grid){
            int l=0;
            int r=row.length-1;
            while(l<=r){
                int mid=(l+r)/2;
                if(row[mid]<0){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            count=count +(row.length-l);
        }
           
        
        return count;
    }
}