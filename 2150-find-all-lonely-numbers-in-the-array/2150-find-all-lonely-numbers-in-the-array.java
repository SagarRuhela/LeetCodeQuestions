class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(int i:map.keySet()){
            if(map.get(i)==1){
                if(map.containsKey(i-1) || map.containsKey(i+1)){
                          continue;
                }
                else{
                    list.add(i);
                }
            }
            
        }
        return list;

    }
}