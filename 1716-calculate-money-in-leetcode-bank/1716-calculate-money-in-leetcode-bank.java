class Solution {
    public int totalMoney(int n) {
        int ans=0;
        int t;
        if(n%7==0){
            t=n/7;
        }
        else{
            t=(n/7)+1;
        }
        int days=1;
        
        for(int i=1;i<=t;i++){
           int count=i;
            for(int j=i+1;j<(7+i);j++){
                if(days==n){
                    break;
                }
                count=count+j;
                days++;
            }
            ans=ans+count;
            days++;
            
        }
        return ans;
    }
}