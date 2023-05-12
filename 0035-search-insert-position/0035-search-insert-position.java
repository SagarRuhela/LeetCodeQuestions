class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]>target){
                return 0;
            }
            else if(nums[0]==target){
                return 0;
            }
            else{
                return 1;
            }
        }
        else{
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(target<nums[0]){
                return 0;
            }
            else if(target>nums[i-1] && target<nums[i]){
                return i;
            }
            else if(target>nums[nums.length-1]){
                return nums.length;
            }
        }
       
    }
        return -1;
    }
}