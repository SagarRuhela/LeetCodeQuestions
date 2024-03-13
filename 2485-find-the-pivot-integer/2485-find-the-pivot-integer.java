class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int i=2;
        int sum1=1;
        int sum2=n;
        int j=n-1;
        while(i<j){
            if(sum1<sum2){
                sum1=sum1+i;
                i++;
            }
            if(sum2<sum1){
                sum2=sum2+j;
                j--;
            }
            if(sum1==sum2){
            if(i==j){
                return i;
            }
            else{
                sum1=sum1+i;
                i++;
            }
            
        }
        }
        return -1;
    }
}