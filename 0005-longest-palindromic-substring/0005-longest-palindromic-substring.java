class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0 || s.length()==1){
            return s;
        }
        //brute force 
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
             if(isPalindrome(s,i,j)){
                 if((j+1-i)>ans.length()){
                     ans=s.substring(i,j+1);
                 }
             }
         }
        }
        if(ans==""){
            return s.substring(0,1);
        }
        return ans;
    }
    public boolean isPalindrome(String str,int i,int j){
        
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}