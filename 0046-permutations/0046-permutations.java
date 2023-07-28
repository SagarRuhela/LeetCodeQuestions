class Solution {
    public void helper( List<List<Integer>> finalList,List<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            finalList.add(new ArrayList<>(temp));
            return;
        }
        for(int i:nums){
            if(temp.contains(i)){
                continue;
            }
            else{
                temp.add(i);
                helper(finalList,temp,nums);
                temp.remove(temp.size()-1);
            }
        }
        return;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(finalList, temp,nums);
        return finalList;
    }
}