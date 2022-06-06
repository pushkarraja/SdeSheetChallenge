class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long newN = n;
        
        if (newN < 0) {
            newN = -newN;
        }
        
        while (newN > 0) {
            if (newN % 2 == 0) {
                x *= x;
                newN /= 2;
            } else {
                ans *= x;
                newN -= 1;
            }
        }
        
        return (n < 0) ? (1.0 / ans) : ans;
        
    }
}
