package reverseStr_541;

/**
 * @author ASUS
 * @ 2022/3/5- 10:28
 */
class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();


        char[] chars = s.toCharArray();
        for (int l = 0,r= l +k; l < n;r+=2*k, l += 2 * k) {
            reverse(chars, l, Math.min(r, n) - 1);//注意此处为什么是-1（长度减一即是下标，之后交换要用到数组的下标）
        }
        return new String(chars);
    }

    public void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
