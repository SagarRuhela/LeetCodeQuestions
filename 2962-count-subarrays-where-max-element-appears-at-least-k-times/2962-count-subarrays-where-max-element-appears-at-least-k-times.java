class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        long count=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        for(int i: nums){
            if(i==max){
                count++;
            }
        }
        if(count<k){
            return 0;
        }
        else{
            int left=0;
            int right=0;
            long count1=0;
            long ans=0;
            while(right<n && left<n){
                if(nums[right]==max){
                    count1++;
                }
                if(count1<k){
                    ans=ans+(right-left+1);
                }
                else{
                    while(nums[left]!=max){
                        left++;
                    }
                    left++;
                    count1--;
                    ans=ans+(right-left+1);
                }
                right++;
            }
            // System.out.println(ans);
            // System.out.println(n*n);

            long total=(long)n*(long)(n+1)/2;
           // System.out.println(total);
            return total-ans;
            
        }
    }
}