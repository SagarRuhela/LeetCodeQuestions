class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(String str:words){
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }
                else{
                    map.put(ch,1);
                }
            }
        }
        int n=words.length;
        for(char keys:map.keySet()){
            if(map.get(keys)%n!=0){
                return false;
            }
        }
        return true;
    }
}