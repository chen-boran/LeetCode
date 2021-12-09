package simplifyPat_071;

import java.util.Stack;
import java.util.Vector;

class Solution {
    public String simplifyPath(String path) {









        Stack<String> stack = new Stack<>();
        StringBuilder ret = new StringBuilder();
        for (String p : path.split("/")) {
            if (!stack.empty() && p.equals("..")) {
                stack.pop();
            } else if (!" ..".contains(p)) {
                stack.push(p);
            }
        }
        for (String i : stack) {
            ret.append("/" + i);
        }
        return ret.length() == 0 ? "/" : ret.toString();
    }
}

