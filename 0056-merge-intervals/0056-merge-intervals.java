class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0){
            return new int[0][];
        }
        ArrayList<int[]>list =new ArrayList<>();
        Arrays.sort(intervals, (a,b) ->a[0]-b[0]);
        int temp[]=intervals[0];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<=temp[1]){
                temp[1]=Math.max(temp[1],intervals[i][1]);
            }
            else{
                list.add(temp);
                temp=intervals[i];
            }
        }
        list.add(temp);
        return list.toArray(new int[0][]);
        
    }
}