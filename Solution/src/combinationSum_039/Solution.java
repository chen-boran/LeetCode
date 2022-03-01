package combinationSum_039;

import java.util.*;

class Solution {
    static List<List<Integer>> ans = new ArrayList<List<Integer>>();
    static void dfs(int[] candidates,int target,int u,int sum,List<Integer> t)
    {
        if(sum > target) return ;

        if(u == candidates.length)
        {
            if(sum == target)
            {
                ans.add(new ArrayList<Integer>(t));
            }
            return;
        }
        //枚举每个数字用多少次
        for(int i = 0;sum + candidates[u] * i <= target;i ++)
        {
            dfs(candidates,target,u + 1,sum + candidates[u] * i,t);
            t.add(candidates[u]);
        }

        for(int i = 0;sum + candidates[u] * i <= target;i ++)
            t.remove(t.size() - 1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans.clear();
        List<Integer> t = new ArrayList<Integer>();
        dfs(candidates,target,0,0,t);

        return ans;
    }
}
