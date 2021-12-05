package groupAnagrams_048;

import java.util.HashMap;
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String >> hashMap= new HashMap<>();

        int n = strs.length;
        for(int i = 0;i < n;i ++)
        {
            //对字符串进行排序，转化成字符数组，排序之后转化成字符串
            char[] tmp = strs[i].toCharArray();
            Arrays.sort(tmp);
            String string =new String(tmp);

            if (!hashMap.containsKey(string)) hashMap.put(string,new ArrayList<>());//新建一个键值对
            //循环添加strs中的每一个元素到对应的ArrayList中
            hashMap.get(string).add(strs[i]);
        }
        List<List<String>> ans = new ArrayList<List<String>>();//输出List<>中的结果
        for(List<String> tmp2 : hashMap.values())
        {
            ans.add(tmp2);
        }
        return ans;
    }
}

