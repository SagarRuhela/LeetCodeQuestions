class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,false);
        }
        for(int i=0;i<n;i++){
             if(map.containsKey(nums[i])){
          map.put(nums[i],true);
             }       
              }
       for(int i=1;i<=n;i++){
           if(map.get(i)==false){
               return i;
           }
       }
       return n+1;       
    }
}