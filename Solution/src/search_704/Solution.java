package search_704;

class Solution {
    public int search(int[] nums, int target) {
        int l = 0,r=nums.length;
        int mid =l+r>>1;
        while(l<r){
            mid =l+r >>1 ;
            if(nums[mid]<target){
                l=mid+1;

            }else r=mid;
        }
        return mid;
    }
}
