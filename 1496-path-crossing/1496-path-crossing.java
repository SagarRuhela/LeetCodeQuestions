class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> set=new HashSet<>();
        set.add("0,0");
        int x=0;
        int y=0;
       for(int i=0;i<path.length();i++){
           if(path.charAt(i)=='N'){
              y++;
           }
           if(path.charAt(i)=='S'){
               y--;
               
           }
           if(path.charAt(i)=='E'){
               x--;
           }
           if(path.charAt(i)=='W'){
               x++;
           }
           String temp=x+","+y;
           if(set.contains(temp)){
               return true;
           }
           else{
               set.add(temp);
           }
       }
        return false;
    }
}