class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k){
            return "0";
        }
        int l=k;
        Stack<Integer> s=new Stack<>();
        int i=0;
        int n=num.length();
        while(i<n){
            int number=num.charAt(i)-48;
            //System.out.println(number);
            while(!s.isEmpty() && (s.peek()>number) && k>0){
                s.pop();
                k--;
            }
            if(!s.isEmpty() || number!=0){
            s.push(number);
            }
            i++;
        }
        
            while(!s.isEmpty() && k>0){
                s.pop();
                k--;
            }
        
        if(s.isEmpty()){
            return "0";
        }
        
         StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        sb.reverse();
        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}