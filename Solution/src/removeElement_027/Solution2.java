package removeElement_027;

public class Solution2 {
    public int removeElement(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j];
                }
            }
        }
        return nums.length;
    }
}
//采用暴力做法，两层循环，删除比较，时间复杂度O（n）