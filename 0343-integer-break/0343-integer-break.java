class Solution {
    public int integerBreak(int n) {
        if(n<=3){
            return n-1;
        }
        if(n==4){
            return n;
        }
        if(n%3==0){
            return (int)Math.pow(3,n/3);
        }
        int count=0;
        int temp=n;
        while(temp>1){
            temp=temp-3;
            count++;
        }
        temp=temp+3;
        count--;
        return (int)Math.pow(3,count)*temp;
    }
}