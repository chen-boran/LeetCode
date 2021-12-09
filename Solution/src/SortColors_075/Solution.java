package SortColors_075;

class Solution {
    public void sortColors(int[] nums) {
        int re = Integer.MAX_VALUE;
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length ; j++) {
                if(nums[j] < re ) {
                    re = nums[j];
                    count = j;
                }
            }
            nums[count]=nums[i];
            nums[i] = re ;
            re = Integer.MAX_VALUE;
        }
    }

}
//每次选出最小的数，进行冒泡排序