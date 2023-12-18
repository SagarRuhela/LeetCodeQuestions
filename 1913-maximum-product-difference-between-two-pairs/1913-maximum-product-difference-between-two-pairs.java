class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int x=nums[0];
        int y=nums[1];
        int a=nums[nums.length-1];
        int b=nums[nums.length-2];
        int num1=Math.abs(x*y-a*b);
        return num1;
    }
}