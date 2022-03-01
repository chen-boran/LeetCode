package myPow_050;

class Solution {
    public double myPow(double x, int n) {
        long ans = 1;
        int tmp =n;
        for (long o= Math.abs(n); o >0 ; o>>=1 ) {
            if((o&1) == 1 ) ans *= x;
            x*=x;

        }
    if(tmp>0 ) ans=1/ans;
    return ans;
    }

}
