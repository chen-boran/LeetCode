package threeSum_15;

import java.util.*;

/**
 * @author ASUS
 * @ 2021/11/16- 11:59
 */
public class Solution {
    public int threeSum(int[] nums) {

        Arrays.sort(nums);
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) break;
            for (int j = i + 1, k = nums.length - 1; j < k; j++) {
                while (nums[i] != 0) {

                }
            }

        }

        return ans;
    }

}
