import java.util.Arrays;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                  count++;
            }
            else{
                sum=sum+(count*(count-1))/2;
                count=1;
            }
        }
        if(count>1){
            sum=sum+ count*(count-1)/2;
        }
        return sum;
        
    }
}