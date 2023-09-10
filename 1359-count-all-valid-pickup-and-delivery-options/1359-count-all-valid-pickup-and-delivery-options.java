class Solution {
    public int countOrders(int n) {
        int total=2*n;
        long ans=1;
        int MOD = 1000000007;
        for(int i=0;i<n;i++){
            ans=(ans*((total*(total-1))/2))%MOD;
            total=total-2;
        }
        return (int)ans;
    }
 
}