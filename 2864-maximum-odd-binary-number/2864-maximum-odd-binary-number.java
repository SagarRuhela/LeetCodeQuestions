class Solution {
    public String maximumOddBinaryNumber(String s) {

    StringBuilder s1=new StringBuilder();
    int zero=0;
    int one=0;

    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='0') zero++;
        else one++;
    }    

    while(one!=1){
        s1.append(1); one--;
    }
    while(zero!=0){
        s1.append(0); zero--;
    }
    s1.append(1);

    return s1.toString();
    
    }
}