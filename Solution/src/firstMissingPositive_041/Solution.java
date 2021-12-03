package firstMissingPositive_041;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.*;

class Solution {
    public int firstMissingPositive(int[] candidates) {
        // 使用hashset进行去重，在进行排序
        HashSet<Integer> hashSet = new HashSet<Integer>(); // 去重
        for (int i = 0; i < candidates.length; i++) {
            hashSet.add(candidates[i]);
        }
        Set<Integer> set = new TreeSet(hashSet);            // 利用TreeSet排序
        Integer[] integers = set.toArray(new Integer[]{});

        int[] result = new int[integers.length];            // 我们排序、去重后的结果数组
        for (int i = 0; i < integers.length; i++) {
            result[i] = integers[i].intValue();
        }


        int k = 1;
        for (int i = 0; i < result.length; i++) {

            if (result[i] <= 0) continue;

            if (result[i] == k) {
                k++;
            } else {
                return k;
            }

        }
        return k;
    }
}
// 后面逻辑比较简单，返回有序去重的数组最小没有出现的数