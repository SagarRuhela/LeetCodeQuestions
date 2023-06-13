class Solution {
    public int equalPairs(int[][] grid) {
        int count=0;
      
        HashMap<String,Integer> map=new HashMap<>();
        for(int row[]:grid ){
            String s=Arrays.toString(row);
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        for(int i=0;i<grid.length;i++){
            int arr[]=new int[grid.length];
            for(int j=0;j<arr.length;j++){
                arr[j]=grid[j][i];
            }
            String s=Arrays.toString(arr);
            if(map.containsKey(s)){
                count=count+map.get(s);
            }
            else{
                continue;
            }
        }
        return count;
    }
}