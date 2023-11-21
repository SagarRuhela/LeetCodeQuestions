class Solution {
    public int rev(int n){
        int rev = 0; 
        int rem;
        while(n>0){
            rem = n % 10; 
            rev = (rev * 10) + rem; 
            n = n / 10; 
        }
        return rev;
    }
    public int countNicePairs(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]-rev(nums[i]);
        }
        HashMap<Integer,Long> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,(long)1);
            }
        }
        int mod=1000000007;
        long count=0;
        for(int i:map.keySet()){
            if(map.get(i)>1){
                count=(count+ (map.get(i)*(map.get(i)-1))/2)%mod;
            }
        }
return (int)count;
    }
}