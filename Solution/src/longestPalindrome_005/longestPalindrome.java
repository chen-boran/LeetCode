package longestPalindrome_005;

/**
 * @author ASUS
 * @ 2021/11/15- 9:57
 */
public class longestPalindrome {
    public String longestPalindrome(String s) {
        int l, r, m = (s.length() + 1) / 2;
        String ans = null;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() % 2 == 1) {
                l = m - 1;
                r = m + 1;//奇数
                while (l > 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                }
                if (ans.length() < r - l - 1)
                    ans = s.substring(l + 1, r - l - 1);
            } else {
                l = m;
                r = m + 1;
                while (l > 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                }
                if (ans.length() < r - l - 1)
                    ans = s.substring(l + 1, r - l - 1);
            }
        }
        return ans;
    }

}
