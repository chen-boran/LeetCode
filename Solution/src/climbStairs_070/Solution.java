package climbStairs_070;

/**
 * @author ASUS
 * @ 2021/12/8- 21:12
 */
class Solution {
    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
