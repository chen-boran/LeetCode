package insert_057;

import java.util.*;

class Solution {
    public int[][] insert(int[][] a, int[] b) {
        int n = a.length;
        List<int[]> ans = new ArrayList<int[]>();
        int k = 0;
        while(k < n && a[k][1] < b[0]) ans.add(a[k ++]);

        if(k < n)
        {
            b[0] = Math.min(b[0],a[k][0]);
            while(k < n && a[k][0] <= b[1])
            {
                b[1] = Math.max(b[1],a[k ++][1]);
            }
        }
        ans.add(b);
        while(k < n)
        {
            ans.add(a[k]);
            k ++;
        }
        int m = ans.size();
        int[][] res = new int[m][2];
        for(int i = 0;i < m;i ++)
        {
            res[i][0] = ans.get(i)[0];
            res[i][1] = ans.get(i)[1];
        }
        return res;
    }
}

