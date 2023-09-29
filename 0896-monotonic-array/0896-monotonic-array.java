class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean for1=true;
        boolean for2=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                continue;
            }
            else{
                for1=false;
                break;
            }
        }
        if(for1){
            return true;
        }
        for(int i=0;i<nums.length-1;i++ ){
            if(nums[i]>=nums[i+1]){
                continue;
            }
            else{
                for2=false;
                break;
            }
        }
        if(for2){
            return true;
        }
        return false;
    }
}