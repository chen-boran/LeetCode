package removeDuplicates_024;

import java.util.HashMap;

/**
 * @author ASUS
 * @ 2021/11/18- 16:33
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i] == nums[j]){
                j++;
            }else{
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}

