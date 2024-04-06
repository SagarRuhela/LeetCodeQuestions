class Solution {
    public String minRemoveToMakeValid(String s) {
        char ch[]=s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==')' && count==0){
                ch[i]='@';
            }
            if(ch[i]=='('){
                count++;
            }
             if(ch[i]==')'){
                count--;
            }   

        }
        count=0;
          for(int i=ch.length-1;i>=0;i--){
            if(ch[i]=='(' && count==0){
                ch[i]='@';
            }
             if(ch[i]==')'){
                count++;
            }
             if(ch[i]=='('){
                count--;
            }   

        }
        String ans="";
        for(char c: ch){
            if(c!='@'){
                ans=ans+c;
            }
        }
        return ans;
    }
}