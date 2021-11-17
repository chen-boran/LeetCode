package maxArea_011;



/**
 * @author ASUS
 * @ 2021/11/16- 9:30
 */

public class Solution {

    public int min(int i, int j) {
        if (i < j) return i;
        else return j;

    }
    public int max(int i, int j) {
        if (i < j) return j;
        else return i;

    }

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int S;
        S = min(height[r], height[l]) * (r - l);
        while (l!=r) {
            if (height[l] < height[r]) {
                l++;
                S = max(S,min(height[r], height[l]) * (r - l));
            } else {
                r--;
                S = max(S,min(height[r], height[l]) * (r - l));
            }
        }
        return S;

    }


}
