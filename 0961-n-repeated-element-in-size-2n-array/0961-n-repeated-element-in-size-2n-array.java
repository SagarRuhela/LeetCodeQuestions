import java.util.Arrays;
class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
           if(nums[i]==nums[i-1]){
           return nums[i];
           }
        }
        return -1;
    }
}