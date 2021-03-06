package searchInsert_035;


class Solution {
    public int searchInsert(int[] nums, int target) {

        int l=0,r=nums.length;

        while(l<r){
            int mid = l+r>>1;
            if (target > nums[mid]) l=mid+1;
            else r=mid;
        }
        return r;
    }
}