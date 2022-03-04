package fourSumCount_454;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ASUS
 * @ 2022/3/4- 16:44
 */
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map =new HashMap<>();
        int sum1 = 0;

        for (int i = 0; i < nums1.length ; i++) {
            for (int j = 0; j < nums2.length; j++) {
                sum1 = nums1[i]+ nums2[j];
                map.put(sum1,map.getOrDefault(sum1,0)+1);
            }
        }
        int count = 0;
        int sum2 = 0;
        for (int i = 0; i < nums3.length ; i++) {
            for (int j = 0; j < nums4.length; j++) {
                sum2 = nums3[i]+ nums4[j];
                 if (map.containsKey(0-sum2)){
                     count += map.get(0-sum2);
                 }
            }
        }
        return count;
    }
}
