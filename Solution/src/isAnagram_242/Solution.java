package isAnagram_242;

import java.util.Arrays;

/**
 * @author ASUS
 * @ 2022/3/4- 9:34
 */

//使用字符串比较的方法，先把字符串排序，之后逐位进行比较
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();//字符串转化成字符数组
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1,t1);//字符比较

    }
}