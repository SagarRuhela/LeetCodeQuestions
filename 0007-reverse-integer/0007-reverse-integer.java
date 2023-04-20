class Solution {
    public int reverse(int x) {
        long ans=0;
        boolean b=true;
        if(x<0){
            x=-1*(x);
            b=false;
        }
        while(x>0){
            long temp=x%10;
            ans=ans*10 + temp;
            x=x/10;
        }
        if(ans>=Integer.MAX_VALUE){
            return 0;
        }
        if(b){
        return (int)ans;
        }
        else{
            return (int)(-1*ans);
        }
    }
}