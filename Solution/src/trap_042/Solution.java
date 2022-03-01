package trap_042;

class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int[] left = new int[n + 10];
        int[] right = new int[n + 10];
        int tt = 0;
        int[] stk = new int[n + 10];

        //找到左边第一个比它大的元素
        for(int i = 0;i < n;i ++)
        {
            while(tt != 0 && h[stk[tt]] <= h[i]) tt --;
            if(tt == 0) left[i] = -1;
            else left[i] = stk[tt];
            stk[++ tt] = i;
        }
        tt = 0;
        //找到右边第一个比它大的元素
        for(int i = n - 1;i >= 0;i --)
        {
            while(tt != 0 && h[stk[tt]] < h[i]) tt --;
            if(tt == 0) right[i] = n;
            else right[i] = stk[tt];
            stk[++ tt] = i;
        }
        int res = 0;
        for(int i = 0;i < n;i ++)
        {
            if(right[i] == n || left[i] == -1) continue;
            int len = right[i] - left[i] - 1;
            res += (Math.min(h[left[i]],h[right[i]]) - h[i]) * len;
        }
        return res;
    }
}
