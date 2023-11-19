class Solution {
    public int reductionOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            if(map.containsKey(nums[i])){
           int step=map.size()-1;
           step=step*map.get(nums[i]);
           count=count+step;
           map.remove(nums[i]);
            }
        }
        return count;
    }
}