package plusOne_066;

/**
 * @author ASUS
 * @ 2021/12/8- 19:24
 */
class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[0]== 0) return new int[]{1};
        int n =digits.length;
        for (int i = n-1 ; i >=0 ; i--) {
            if (digits[i]!= 9){
                digits[i]++;
                for (int j = i+1; j < n ; j++) {
                    digits[j]=0;
                }
                return digits;
            }

        }
        //全部都是9
        int[] ans = new int[n+1];
        ans[0] = 1;
        return ans;

    }
}
