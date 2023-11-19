class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int step=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                step++;
            }
            count=count+step;
        }
        return count;
    }
}