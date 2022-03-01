package sortedsquares_977;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] tmp = new int[nums.length];
        int l=0,r=nums.length-1;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[l]*nums[l]<=nums[r]*nums[r]){
                tmp[i]= nums[r]*nums[r--];
            }else tmp[i]= nums[l]*nums[l++];
        }
        return tmp;
    }
}
//采用双指针的方法，最大的值一定在数组的两侧平方之后得到。