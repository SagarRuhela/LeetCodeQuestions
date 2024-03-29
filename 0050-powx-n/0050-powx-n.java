class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        if (n == 0) return 1.0;
        
        double half = myPow(x, n/2);
        if (n % 2 == 0) {
            return half * half;
        } else if (n < 0) {
            return (1.0 / x) * half * half;
        } else {
            return x * half * half;
        }
    }
}