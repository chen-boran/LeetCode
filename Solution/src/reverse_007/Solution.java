package reverse_007;

/**
 * @author ASUS
 * @ 2021/11/15- 11:07
 */
public class Solution {


    public int reverse(int x) {
        long res = 0;
        int flag = 0;

        if (x > 0) {
            flag = 1;
            while (x != 0) {
                res = res * 10 + x % 10;
                x /= 10;
            }
        } else {
            x = -x;
            while (x != 0) {
                res = res * 10 + x % 10;
                x /= 10;
            }

        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        else if (flag == 1)
            return (int) res;
        else return (int) -res;


    }
//直观解法：重点注意我字符串转换的方法：依次除以十，余数返回，商接着除，直到除数为零
    //分开正数负数处理，最后判断条件返回结果

}



