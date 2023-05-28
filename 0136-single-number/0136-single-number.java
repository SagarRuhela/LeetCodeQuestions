class Solution {
    public int singleNumber(int[] nums) {
        int singlenumber=0;
        for(int i=0;i<nums.length;i++){
            singlenumber=singlenumber^nums[i];
        }
        return singlenumber;
    }
}