import java.util.Arrays;
class Solution {
    public int maxSubArray(int[] nums) {
    
        if(nums.length==1){
            return nums[0];
        }
        int max=Integer.MIN_VALUE;
        int maxtillNow=0;
        for(int i=0;i<nums.length;i++){
            maxtillNow=maxtillNow+ nums[i];
            if(max<maxtillNow){
                max=maxtillNow;
            }
            if(maxtillNow<0){
               maxtillNow=0;                                 
            }
        }
        return max;
    }
}