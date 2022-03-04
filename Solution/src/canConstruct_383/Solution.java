package canConstruct_383;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ASUS
 * @ 2022/3/4- 13:52
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length()<ransomNote.length()) return false;
        Map<Character,Integer> map =new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(map,0)+1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.containsKey(ransomNote.charAt(i))&&map.get(ransomNote.charAt(i))>0){

                map.put(ransomNote.charAt(i),map.getOrDefault(map,0)-1);
            }else
                return false;
        }
        return true;
    }
}
//确定是否包含某些元素，可以使用哈希表