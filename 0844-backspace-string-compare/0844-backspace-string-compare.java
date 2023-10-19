class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='#'){
                if(s1.isEmpty()){
                    continue;
                }
                else{
                    s1.pop();
                }
            }
            else{
                s1.add(c);
            }
        }
         for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(c=='#'){
                if(s2.isEmpty()){
                    continue;
                }
                else{
                    s2.pop();
                }
            }
            else{
                s2.add(c);
            }
        }
        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;

        }
    }
}