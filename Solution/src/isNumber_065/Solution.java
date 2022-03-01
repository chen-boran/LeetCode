package isNumber_065;

/**
 * @author ASUS
 * @ 2021/12/8- 19:10
 */
class Solution {
    public boolean isNumber(String s) {
        int l = 0,r = s.length() - 1;
        while(l <= r && s.charAt(l) == ' ') l ++;
        while(l <= r && s.charAt(r) == ' ') r --;
        if(l > r) return false;
        s = s.substring(l,r + 1);

        if(s.charAt(0) == '+' || s.charAt(0) == '-') s = s.substring(1);
        if(s.length() == 0) return false;

        if(s.charAt(0) == '.' && (s.length() == 1 || s.charAt(1) == 'e' || s.charAt(1) == 'E'))
            return false;

        int dot = 0,e = 0;//dot表示小数点个数，e表示e的个数
        for(int i = 0;i < s.length();i ++)
        {
            if(s.charAt(i) == '.')
            {
                if(dot > 0 || e > 0) return false;
                dot ++;
            }else if(s.charAt(i) == 'e' || s.charAt(i) == 'E')
            {
                if(i == 0 || i + 1 == s.length() || e > 0) return false;
                if(s.charAt(i + 1) == '+' || s.charAt(i + 1) == '-')
                {
                    if(i + 2 == s.length()) return false;
                    i ++;
                }
                e ++;
            }else if(s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }
        return true;
    }
}

