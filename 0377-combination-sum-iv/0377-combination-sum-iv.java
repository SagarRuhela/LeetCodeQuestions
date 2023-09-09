class Solution {
    public int combinationSum4(int[] nums, int target) {
        int memo[]=new int[target+1];
        Arrays.fill(memo,-1);
        int ans=helper(0,nums,target,memo);
        return ans;
    }
    public int helper(int idx,int nums[],int target,int memo[]){
        if(target==0){
            return 1;
        }
        if(target<0){
            return 0;
        }
        if(memo[target]!=-1){
            return memo[target];
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            target=target-nums[i];
            count=count+helper(i,nums,target,memo);
            target=target+nums[i];
        }
        memo[target]=count;
        return count;
    }
}