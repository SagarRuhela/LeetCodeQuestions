class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int max=0;
        for(int i=nums.length-1;i>=0;i--){
            int curr=1;
            int newK=k;
            int currEle=nums[i];
            for(int j=i-1;j>=0;j--){
                if(currEle-nums[j]<=newK){
                   curr++;
                   newK=newK-(currEle-nums[j]);
                }
                else{
                    break;
                }
            }
            max=Math.max(max,curr);
            if(max>=i){
                break;
            }

        }
        return max;
    }
}