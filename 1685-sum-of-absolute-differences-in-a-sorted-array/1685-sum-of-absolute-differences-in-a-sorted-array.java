class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum=0;
        int n=nums.length;
        int prefix[]=new int[n];
        int sufix[]=new int[n];
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            prefix[i]=sum;
        }
        int sum1=0;
         for(int i=n-1;i>=0;i--){
            sum1=sum1+nums[i];
            sufix[i]=sum1;
        }
        int ans[]=new int[n];
        ans[0]=Math.abs(nums[0]*n-sum);
        ans[n-1]=Math.abs(nums[n-1]*n-sum);
        for(int i=1;i<n-1;i++){
              ans[i]=((nums[i]*(i+1))-(prefix[i]))+(sufix[i+1]-nums[i]*(n-(i+1)));
        }
        return ans;


        
    }
}