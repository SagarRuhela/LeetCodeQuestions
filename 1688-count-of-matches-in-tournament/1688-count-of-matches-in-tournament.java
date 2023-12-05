class Solution {
    public int numberOfMatches(int n) {
        if(n==1){
            return 0;
        }
        int count=0;
        while(n!=0){
            if(n==2){
                count++;
                break;
            }
            if(n%2==0){
                count=count+n/2;
                n=n/2;
            }
            else{
                count=count+n/2;
                n=n/2;
                n++;
            }
        }
        return count;
    }
}