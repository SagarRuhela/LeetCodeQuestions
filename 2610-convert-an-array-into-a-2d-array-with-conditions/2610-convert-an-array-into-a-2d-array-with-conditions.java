class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        while(!map.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            for(int  key : map.keySet()){
                if(map.get(key)>0){
                    temp.add(key);
                    map.put(key,map.get(key)-1);
                }
               
            }
            
            if(temp.size()==0){
                break;
            }
            if(temp.size()>0){
            list.add(temp);
        }}
        return list;
    }
}