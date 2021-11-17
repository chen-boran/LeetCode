package intToRoman_12;

/**
 * @author ASUS
 * @ 2021/11/17- 15:32
 */
public class Solution {

    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] key = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < values.length; i++) {

            while (num >= values[i]) {
                num -= values[i];
                ans.append(key[i]);
            }
            if (num == 0) {
                break;
            }
        }
        return ans.toString();
    }
}


