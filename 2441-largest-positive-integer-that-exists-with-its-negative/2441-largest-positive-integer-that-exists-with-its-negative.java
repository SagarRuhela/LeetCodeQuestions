class Solution {
    public int findMaxK(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0;
        int j=n-1;
        while(i<j){
            if(nums[i]==-1*nums[j]){
                return nums[j];
            }
            else{
                if(nums[i]*-1> nums[j]){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return -1;
    }
}