class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s1=new Stack<>();
        int i=0;
        int first=Integer.parseInt(tokens[i++]); 
        s1.push(first);
        int ans=first;
        while(!s1.isEmpty()){
            if(i>=tokens.length){
                break;
            }
           if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int a=s1.pop();
                int b=s1.pop();
                int temp;
               if(tokens[i].equals("+")){
                temp= b+a;
               }
               else if(tokens[i].equals("-")){
                   temp=b-a;
               }
               else if( tokens[i].equals("*")){
                   temp=a*b;
               }
               else{
                   temp=b/a;
               }
               ans=temp;
               s1.push(temp);
               i++;
           }
           else{
               s1.push(Integer.parseInt(tokens[i++]));
           }    
        }
        return ans;
    }
}