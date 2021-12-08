package addBinary_067;

/**
 * @author ASUS
 * @ 2021/12/8- 20:22
 */
class Solution2 {
    public String addBinary(String a, String b) {

        StringBuffer sba = new StringBuffer(a);
        StringBuffer sbb = new StringBuffer(b);
        sba = sba.reverse();
        sbb = sbb.reverse();

        StringBuffer ans = new StringBuffer("");
        int t = 0;
        for(int i = 0;i < sba.length() || i < sbb.length();i ++)
        {
            if(i < sba.length()) t += sba.charAt(i) - '0';
            if(i < sbb.length()) t += sbb.charAt(i) - '0';
            ans.append(t % 2);
            t /= 2;
        }
        if(t != 0) ans.append(t);

        return ans.reverse().toString();
    }
}

