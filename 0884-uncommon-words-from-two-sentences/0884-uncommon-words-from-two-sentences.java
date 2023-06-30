class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        String str="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' '){
                if(map.containsKey(str)){
                    map.put(str,map.get(str)+1);
                    str="";
                }
                else{
                    map.put(str,1);
                    str="";
                }
            }
            else{
                str=str+s1.charAt(i);
            }
        }
        if(map.containsKey(str)){
                    map.put(str,map.get(str)+1);
                    str="";
                }
                else{
                    map.put(str,1);
                    str="";
                }
        
         for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)==' '){
                if(map.containsKey(str)){
                    map.put(str,map.get(str)+1);
                    str="";
                }
                else{
                    map.put(str,1);
                    str="";
                }
            }
            else{
                str=str+s2.charAt(i);
            }
        }
        if(map.containsKey(str)){
                    map.put(str,map.get(str)+1);
                    str="";
                }
                else{
                    map.put(str,1);
                    str="";
                }
        ArrayList<String>ans=new ArrayList<>();
        Set<String> keys=map.keySet();
        for(String s:keys){
            if(map.get(s)==1){
                ans.add(s);
            }
        }
        String ans1[]=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            ans1[i]=ans.get(i);
        }
        return ans1;
        
    }
}