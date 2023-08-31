class Solution {
    public long minimumReplacement(int[] nums) {
        long steps=0;
        int n=nums.length;
        long last=nums[n-1];
        for(int i=n-2;i>=0;i--){
            int curr=nums[i];
            if(curr>last){
            if(curr%last==0){
                long temp=curr/last;
                temp--;
                steps=steps+temp;
                last=curr/(temp+1);
            }
            else{
                long temp=curr/last;
                steps=steps+temp;
                last=curr/(temp+1);
            }
            }
            else{
                last=curr;
            }
        }
        return steps;
    }
}