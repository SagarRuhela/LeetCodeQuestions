class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
          for(int j=i+1;j<n-2;j++){
              if(j>i+1 && nums[j]==nums[j-1]){
                  continue;
              }
          
          int k=j+1;
          int l=n-1;
          long sum=nums[i]+nums[j];
          long newTarget=((long)target-sum);
          while(k<l){
              if(k>j+1 && nums[k]==nums[k-1]){
                  k++;
                  continue;
              }
              else if(l<n-1 && nums[l]== nums[l+1]){
                  l--;
                  continue;
              }
               
               if(newTarget==nums[k]+nums[l]){
                   ans.add(new ArrayList(List.of(nums[i],nums[j],nums[k],nums[l])));
                   k++;
                   l--;
               }
               else if(newTarget<nums[k]+nums[l]){
                   l--;
               }
               else{
                   k++;
               }
          }
          }   
        }
        return ans;
    }
}