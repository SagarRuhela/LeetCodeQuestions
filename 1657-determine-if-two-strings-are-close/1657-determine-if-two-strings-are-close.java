class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<word1.length();i++){
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(i);

            if(map1.containsKey(ch1)){
                map1.put(ch1,map1.get(ch1)+1);
            }
            else{
                map1.put(ch1,1);
            }
            if(map2.containsKey(ch2)){
                map2.put(ch2,map2.get(ch2)+1);
            }
            else{
                map2.put(ch2,1);
            }
        }
       ArrayList<Integer>list=new ArrayList<>();
        for(char c:map1.keySet()){
            if(!map2.containsKey(c)){
                   return false;
            }
            list.add(map1.get(c));
        }
        for(char c:map2.keySet()){
            Integer temp=map2.get(c);
            if(list.contains(temp)){
                list.remove(temp);
            }
        }
        if(list.size()==0){
            return true;
        }
        return false;

    }
}