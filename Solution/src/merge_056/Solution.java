package merge_056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


class Solution {
    public int[][] merge(int[][] intervals) {
        int n =intervals.length;
        if(n== 0 || intervals == null) return  new int[][]{} ;
        Arrays.sort(intervals,(x,y) -> x[0] - y[0]);
        List<int[] > list = new ArrayList<>();
        //排序，按照每个数组元素0号进行排序

        int l = intervals[0][0], r =intervals[0][1];

        for (int i = 1; i < intervals.length ; i++) {
            if (r < intervals[i][0]){//如果下一个左端点>现在的右段点，就不进行合并

                list.add(new int[]{l,r});

                l = intervals[i][0];
                r = intervals[i][1];
            }else r = Math.max(r,intervals[i][1]);

        }
        list.add(new int[]{l,r});
        int m = list.size();
        int[][] ans = new int[m][2];
        for(int i = 0;i < m;i ++)
        {
            ans[i][0] = list.get(i)[0];
            ans[i][1] = list.get(i)[1];
        }

        return ans;

    }
}
