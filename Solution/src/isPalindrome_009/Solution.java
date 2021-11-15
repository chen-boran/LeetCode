package isPalindrome_009;

import jdk.nashorn.internal.ir.ReturnNode;

/**
 * @author ASUS
 * @ 2021/11/15- 15:36
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int tmp = x;
        long ans = 0;
        while (tmp != 0) {
            ans = ans * 10 + tmp % 10;
            tmp /= 10;
        }
        return ans == x;





    }
}
//用变量临时代替x进行判断。
//另一种方法是使用函数把数字变成字符串，之后倒置，比较是否相等
