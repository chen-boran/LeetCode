package generateMatrix_059;

import java.util.Arrays;

class Solution {
    static int INF = 0x3f3f3f3f;
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        for(int i = 0;i < n;i ++) Arrays.fill(ans[i],INF);
        int k = 0;
        int x = 0,y = -1;
        while(k != n * n)
        {
            //向右走
            while(y + 1 < n && ans[x][y + 1] == INF)
            {
                ans[x][y + 1] = ++ k;
                y ++;
            }
            //向下走
            while(x + 1 < n && ans[x + 1][y] == INF)
            {
                ans[x + 1][y] = ++ k;
                x ++;
            }
            //向左走
            while(y - 1 >= 0 && ans[x][y - 1] == INF)
            {
                ans[x][y - 1] = ++ k;
                y --;
            }
            //向上走
            while(x - 1 >= 0 && ans[x - 1][y] == INF)
            {
                ans[x - 1][y] = ++ k;
                x --;
            }
        }
        return ans;
    }
}