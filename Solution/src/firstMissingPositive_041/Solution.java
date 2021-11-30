package firstMissingPositive_041;

import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int k=1;
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i]<=0) continue;

            if(nums[i]!=k ) return nums[i-1]+1;
            else {
                k++;
            }
        }
        return k;
    }
}