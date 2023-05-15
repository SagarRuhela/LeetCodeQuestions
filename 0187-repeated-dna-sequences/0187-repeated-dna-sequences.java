class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(10+i<=s.length()){
                String str=s.substring(i,10+i);
                if(map.containsKey(str)){
                    map.put(str,map.get(str)+1);
                }
                else{
                    map.put(str,1);
                }
            }
        }
        List<String> ans=new ArrayList<>();
        Set<String> keys=map.keySet();
        for(String i: keys){
            if(map.get(i)>1){
                ans.add(i);
            }
            else{
                continue;
            }
        }
        return ans;
    }
}