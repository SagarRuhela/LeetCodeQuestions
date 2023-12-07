class Solution {
    public String largestOddNumber(String num) {
        char ch[]=num.toCharArray();
        String ans="";
        boolean flag=false;
        for(int i=ch.length-1;i>=0;i--){
            int temp=ch[i]-'0';
            if((temp)%2!=0){
              flag=true;
            }
            
            if(flag){
               ans=ch[i]+ans;
            }
        }
        return ans;
    }
}