class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> output=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        helper(0,candidates,target,output,temp);
        return output;
    }
    public void helper(int index,int arr[],int target,List<List<Integer>> output,List<Integer>temp){
        if(target==0){
            output.add(new ArrayList<>(temp));
            return;
        }
        else if(target<0){
            return;
        }
        for(int i=index;i<arr.length;i++){
            temp.add(arr[i]);
            helper(i,arr,target-arr[i],output,temp);
            temp.remove(temp.size()-1);
        }
        return;
    }
}