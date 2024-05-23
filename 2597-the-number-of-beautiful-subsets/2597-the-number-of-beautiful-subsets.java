class Solution {
    int[] arr = new int[1001];
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        return helper(0, nums, k)-1;
    }

    public int helper(int index, int[] nums, int k) {
        //base case
        if(index == nums.length) {
            return 1;
        }

        int pick = 0;
        if(nums[index]-k < 0 || arr[nums[index]-k] == 0) {
            arr[nums[index]]++;
            pick = helper(index+1, nums, k);
            arr[nums[index]]--;
        }

        int noPick = helper(index+1, nums, k);

        return pick+noPick;
    }
}