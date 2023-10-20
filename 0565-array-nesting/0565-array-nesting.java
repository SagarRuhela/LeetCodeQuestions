class Solution {
    public int arrayNesting(int[] nums) {
        int n=nums.length;
        boolean visited[]=new boolean[n];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
         ans=Math.max(ans,helper(nums,i,visited));
        }
        }
        return  ans+1;
    }
    public int helper(int nums[],int idx, boolean visited[]){
        if(visited[idx]==true || idx>=nums.length){
            return -1;
        }
        visited[idx]=true;
    idx=nums[idx];
    int ans=0;
    if(!visited[idx]){
     ans=ans+1+helper(nums,idx,visited);
    }
       return ans;
    }
}