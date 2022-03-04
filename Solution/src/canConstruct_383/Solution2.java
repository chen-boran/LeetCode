package canConstruct_383;

/**
 * @author ASUS
 * @ 2022/3/4- 14:14
 */
class Solution2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] tmp = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            tmp[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            tmp[ransomNote.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (tmp[i]<0) return false;
        }
        return true;
    }

}
//可以使用数组来确定是否包含某些元素