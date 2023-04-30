class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]<nums[i] && nums[i+1]<nums[i]){
                return i;
                
            }
            else{
                continue;
            }
        }
       if(nums[nums.length-1]>nums[nums.length-2]){
           return nums.length-1;
       }
       else{
           return 0;
       }
    }
}