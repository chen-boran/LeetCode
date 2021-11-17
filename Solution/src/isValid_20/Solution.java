package isValid_20;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author ASUS
 * @ 2021/11/17- 10:21
 */
public class Solution {
    public boolean isValid(String s) {

        if (s.length() / 2 == 1) return false;
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');


        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length() - 1; i++) {
            char tmp = s.charAt(i);
            if (!(hashMap.containsKey(tmp))) {
                stack.push(tmp);
                //如果哈希表中不存在相关key，说明是左端的括号
            } else {
//当有右端括号出现时，和栈顶元素比较，如果栈是空的说明没有左括号闭合，或者栈顶元素不匹配，说明最内侧左右括号不匹配，返回false
                if (stack.isEmpty() || stack.peek() != hashMap.get(tmp)) {
                    return false;
                } else
                    //匹配成功，把栈顶元素出栈
                    stack.pop();

            }


        }
        return stack.isEmpty();

    }
}
