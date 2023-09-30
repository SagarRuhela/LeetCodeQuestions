class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
       Stack<Integer> stack=new Stack<>();
       int thirdnumber=Integer.MIN_VALUE;
       for(int i=n-1;i>=0;i--){
           if(thirdnumber>nums[i]){
               return true;
           }
           while(!stack.isEmpty() && stack.peek()<nums[i]){
          thirdnumber=stack.pop();
           }
           stack.push(nums[i]);
       } 
       return  false;
    }
}