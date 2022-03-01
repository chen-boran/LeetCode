package removeElement_027;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]!=val){

                nums[i++]=nums[j];
            }
            j++;
        }
        return  i;
    }
}
//采用双指针算法，快慢指针原地修改数组。时间复杂度O（n）