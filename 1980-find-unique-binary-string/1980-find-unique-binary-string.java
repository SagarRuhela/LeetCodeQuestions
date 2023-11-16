class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        String ans="";
        for(int i=0;i<n;i++){
           if(nums[i].charAt(i)=='1'){
               ans=ans+'0';
           }
           else{
               ans=ans+'1';
           }
        }
        return ans;
    }
}