package isAnagram_242;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/**
 * @author ASUS
 * @ 2022/3/4- 9:45
 */
class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()){
            return false;
        }
        HashMap<Character,Integer> map =new HashMap<Character,Integer>();
         for (int i = 0; i < s.length(); i++) {
             Character tmp = s.charAt(i);
            map.put(tmp, map.getOrDefault(tmp,0)+1);//注意map要定义两个参数的数据类型，否则getOrDefault会报错。
        }
        for (int i = 0; i < t.length(); i++) {
            Character tmp = t.charAt(i);
            map.put(tmp,map.getOrDefault(tmp,0)-1);
            if (map.containsValue(-1)){
                return  false;
            }

        }
        return true;
    }
}
