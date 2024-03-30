class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0;
        int right=0;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<nums.length){
            int temp=nums[right];
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }
            else{
                map.put(temp,1);
            }
            if(map.get(temp)<=k){
               max=Math.max(max,(right-left+1));
            }
            else{
                while(nums[left]!=temp){
                    map.put(nums[left],map.get(nums[left])-1);
                    left++;
                }
                map.put(temp,map.get(temp)-1);
                left++;
                max=Math.max(max,(right-left+1));
            }
            right++;

        }
        return max;
    }
}