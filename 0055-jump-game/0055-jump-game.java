class Solution {
    public boolean canJump(int[] nums) {
        int memo[]=new int[nums.length+1];
        for(int i=0;i<memo.length;i++){
            memo[i]=-1;
        }
        int ans=helper(0,nums,memo);
        if(ans==nums.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public int helper(int idx,int nums[],int memo[]){
        if(idx>=nums.length-1){
            return nums.length-1;
        }
        if(memo[idx]!=-1){
            return memo[idx];
        }
        int ans1=0;
        for(int j=1;j<=nums[idx];j++){
            ans1=Math.max(ans1,helper(idx+j,nums,memo));
            if(ans1==nums.length-1){
                break;
            }
        }
        
        return memo[idx]=ans1;
    }
}