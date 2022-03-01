package countAndSay_038;

class Solution2 {
    public String countAndSay(int n) {
        StringBuilder ans = new StringBuilder("1");
        for(int i = 1;i < n;i ++)
        {
            StringBuilder t = new StringBuilder("");
            for(int j = 0;j < ans.length();)
            {
                int k = j;
                while(k < ans.length() && ans.charAt(k) == ans.charAt(j)) k ++;

                t.append(k - j).append(ans.charAt(j));
                j = k ;
            }
            ans = t;
        }
        return ans.toString();
    }
}

 //使用Stingbuilder频繁更改字符串，更快