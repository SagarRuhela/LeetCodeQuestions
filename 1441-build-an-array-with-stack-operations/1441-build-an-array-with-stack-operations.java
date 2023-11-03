class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        int j=0;
        for(int i=1;i<=n;i++){
            list.add("Push");
            if(i==target[j]){
                j++;
                if(j>=target.length){
                    break;
                }
                continue;
            }
            else{
                list.add("Pop");
            }
        }
        return list;
    }
}