package minSubArrayLen_209;

/**
 * @author ASUS
 * @ 2022/3/1- 17:45
 */
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int l = 0, r = 0, sum = 0, min = Integer.MAX_VALUE;
        while (r < nums.length) {
            sum += nums[r++];
            while (sum >= s) {
                min = Math.min(min, r - l);
                sum -= nums[l++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

}
