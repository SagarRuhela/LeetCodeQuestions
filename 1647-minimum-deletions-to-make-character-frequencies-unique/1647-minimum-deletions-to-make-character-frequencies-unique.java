class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i< s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        Set<Integer> set=new HashSet<>();
        int count=0;
        for(int i:map.values()){
            
               while(i>0 && set.contains(i)){
                   count++;
                   i--;
               }   
            
            set.add(i);
        }
        return count;
    }
}