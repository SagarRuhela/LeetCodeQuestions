import java.util.Arrays;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else {
                if(count>n/3){
                    list.add(nums[i-1]);
                }
                count=1;
            }
        }
        if(count>n/3){
            list.add(nums[n-1]);
        }
        return list;
    }
}