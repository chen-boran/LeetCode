package convert_006;

/**
 * @author ASUS
 * @ 2021/11/15- 11:55
 */
public class Solution {
    public String convert(String s, int numRows) {
        String ans = null;
        int n = s.length();
        for (int i = 1; i < numRows; i++) {
            if (i == 0 || i == numRows - 1) {
                for (int a = i; a < s.length(); a += (2 * numRows - 2))
                    ans += s.charAt(a);
            } else {
                for (int b = i, c = 2 * n - 2 - i; b < n || c < n; b += (2 * numRows - 2), c += (2 * numRows - 2)) {
                    if (b < n) ans += s.charAt(b);
                    if (c < n) ans += s.charAt(c);
                }
            }
        }
        return ans;
    }
}
