class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int si=0;
        int ei=nums.length-1;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ans[si]=nums[i];
                si++;
        }
        }
            for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                ans[si]=nums[i];
                si++;
        }
            }
                for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                ans[si]=nums[i];
                si++;
        }
                    
     
    }
                
    return ans;
            }
}