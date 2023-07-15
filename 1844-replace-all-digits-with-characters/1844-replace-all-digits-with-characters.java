class Solution {
    public String replaceDigits(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
          if(i%2==0){
            ans=ans+s.charAt(i);
          }
          else{
          char ch=(char)(s.charAt(i-1)+s.charAt(i)-'0');
          ans=ans+ch;
          }
        }
        return ans;
    }
}