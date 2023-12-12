class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
      int max1=-1;
      int idx=-1;
      for(int i=0;i<n;i++){
          int temp=Math.max(max1,nums[i]);
          if(temp!=max1){
              max1=temp;
              idx=i;
          }
      }
        nums[idx]=-1;
        int max2=-1;
        for(int i:nums){
            max2=Math.max(i,max2);
        }
        return (max1-1)*(max2-1);
    }
    
}
