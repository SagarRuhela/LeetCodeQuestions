class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
            map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        ArrayList<Character> list=new ArrayList<>();
        PriorityQueue<Character> queue=new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        queue.addAll(map.keySet());
        while(queue.size()>1){
            char c1=queue.poll();
            char c2=queue.poll();
            list.add(c1);
            list.add(c2);
            map.put(c1,map.get(c1)-1);
            map.put(c2,map.get(c2)-1);
            if(map.get(c1)>=1){
                queue.add(c1);
            }
            if(map.get(c2)>=1){
                queue.add(c2);
            }
        }
         String str="";
            for(char i: list){
                str=str+i;
            }   
        if(queue.isEmpty()){
             return str;
        }
        
        else if(map.get(queue.peek())>1){
            return "";
        }
        else{
          char last=queue.peek();    
         return str+last;
        }
    }
   
}