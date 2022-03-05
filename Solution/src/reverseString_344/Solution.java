package reverseString_344;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * @author ASUS
 * @ 2022/3/5- 10:05
 */

//直接使用双指针算法，交换两边的值
class Solution {
    public void reverseString(char[] s) {
        int l= 0,r= s.length-1;
        while (l<r){
            char tmp = s[l];
            s[l]=s[r];
            s[r]=tmp;
            l++;
            r--;
        }
    }

 /*
    private void swap(char a,char b){
        char tmp = a;
        a = b;
        b = tmp;
        }
*/


}
