package maxSubArray_053;

class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0,ans =nums[0];//此处让ans初始化未第一个元素，避免因为数组只有一个元素，进行的判断
        for (int i = 0; i < nums.length; i++) {
            if(sum>=0 ) sum += nums[i];
            else sum = nums[i];

            ans =Math.max(sum,ans);
        }
        return ans;
    }
}
