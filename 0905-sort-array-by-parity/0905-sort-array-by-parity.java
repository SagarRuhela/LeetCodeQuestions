class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int arr[]=new int[nums.length];
       int i=0;
       int k=0;
       int j=nums.length-1;
       while(k<=j){
          if(nums[i]%2==0){
          arr[k]=nums[i];
          i++;
          k++;
          }
          else{
              arr[j]=nums[i];
              i++;
              j--;
          }

       } 
       return arr;
    }
}