class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    temp.add(1);
                }
                else{
                    int a=finalList.get(i-1).get(j-1);
                    int b=finalList.get(i-1).get(j);
                    temp.add(a+b);
                }
            }
            finalList.add(temp);
        }
        return finalList;
    }
}