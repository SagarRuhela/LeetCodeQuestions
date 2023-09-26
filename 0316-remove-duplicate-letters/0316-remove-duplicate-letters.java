class Solution {
    public String removeDuplicateLetters(String s) {
        char arr[]=new char[26];
        for(char c: s.toCharArray()){
            arr[c-'a']++;
        }
        Stack<Character> stack=new Stack<>();
        boolean visited[]=new boolean[26];
        for(char c: s.toCharArray()){
            arr[c-'a']--;
            if(!visited[c-'a']){
                while(!stack.isEmpty() && c<stack.peek() && arr[stack.peek()-'a']>0){
                    char temp1=stack.pop();
                    visited[temp1-'a']=false;
                }
                stack.push(c);
                visited[c-'a']=true;
            }
            
        }
       String ans="";
       while(!stack.isEmpty()){
           char temp=stack.pop();
           ans=temp+ans;
       } 
       return ans;
    }
}