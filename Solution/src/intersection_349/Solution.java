package intersection_349;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author ASUS
 * @ 2022/3/4- 14:55
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set =new HashSet<Integer>();
        HashSet<Integer> ans =new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]))
                ans.add(nums2[i]);
        }

        int[] answer = new int[ans.size()];
        int index = 0;
        for (int i : ans) {
           answer[ index ++] = i;
        }
        return answer;
    }
}
