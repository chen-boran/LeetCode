package generateParenthesis_022;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ASUS
 * @ 2021/11/18- 15:39
 */

class Solution {
    List<String> ans = new ArrayList<String>();
    static void dfs(int n,int l,int r,String s)
    {
        if(l == r && l == n)
        {
            String ans=new String();
            ans.length();
            return ;
        }
        if(l < n) dfs(n,l + 1,r,s + "(");
        if(r < l) dfs(n,l,r + 1,s + ")");
    }
    public List<String> generateParenthesis(int n) {
        ans.clear();
        dfs(n,0,0,"");
        return ans;
    }
}

