package romanToInt_013;

import java.util.HashMap;

/**
 * @author ASUS
 * @ 2021/11/17- 14:48
 */
public class Solution {


    public int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        int ans = 0;

        for (int i = 0; i < s.length() ; i++) {
            if (i < s.length() - 1 && hashMap.get(s.charAt(i))  <hashMap.get(s.charAt(i+1)))
                ans -= hashMap.get(s.charAt(i));
            else ans += hashMap.get(s.charAt(i));


        }
        return ans;


    }

}
