class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        // first crete the priority queue so that we can store the largest sum at particular index
        PriorityQueue<int []> que=new PriorityQueue<>((a,b)->b[0]-a[0]);
        // now we are going the create the dp so that we can store the largest sum 
        int dp[]=new int[nums.length];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0]=nums[0];
        que.add(new int[]{nums[0],0});
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            while(!que.isEmpty() && i-que.peek()[1]>k){
                que.remove();
            }
        dp[i]=Math.max(nums[i],nums[i]+que.peek()[0]);
        ans=Math.max(ans,dp[i]);
        que.add(new int[]{dp[i],i});
        }
        return ans;
    }
}