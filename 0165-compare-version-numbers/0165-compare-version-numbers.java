class Solution {
    public int compareVersion(String version1, String version2) {
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        String temp="";
        for(int i=0;i<version1.length();i++){
          if(version1.charAt(i)=='.'){
            list1.add(temp);
            temp="";
          }
          else{
          temp=temp+version1.charAt(i);
          }
        }
        list1.add(temp);
        temp="";
        for(int i=0;i<version2.length();i++){
          if(version2.charAt(i)=='.'){
            list2.add(temp);
            temp="";
          }
          else{
          temp=temp+version2.charAt(i);
          }
        }
        list2.add(temp);

        for(int i=0;i<Math.max(list1.size(),list2.size()); i++){
            int n1;
            int n2;
            if(i>=list1.size()){
                n1=0;
            }
            else{
                n1=Integer.parseInt(list1.get(i));
            }

            if(i>=list2.size()){
                n2=0;
            }
            else{
                n2=Integer.parseInt(list2.get(i));
            }
              //System.out.println(n1+", "+n2);
            if(n1<n2){
                return -1;
            }
            if(n1>n2){
                return 1;
            }
        }
     return 0;
    }
}