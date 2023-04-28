class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        if(str.length()==1){
            return true;
        }
        int i=0;
        int j=str.length()-1;
        boolean b=true;
        while(i<j){
        if(str.charAt(i)!=str.charAt(j)){
            b=false;
        }
       
        i++;
        j--;
        
        }
        if(b){
            return true;
        }
        else{
        return false;
        }
        }
    }
