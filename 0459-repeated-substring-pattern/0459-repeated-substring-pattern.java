class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                boolean b=helper(s,i);
                if(b){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean helper(String s, int j){
        String str=s.substring(0,j);
        for(int i=j;i<s.length();i=i+str.length()){
        
        String temp=s.substring(i,i+str.length());
        if(!temp.equals(str)){
            return false;
        }
        }
        return true;
    }
}