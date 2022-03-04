package isHappy_202;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ASUS
 * @ 2022/3/4- 16:15
 */
class Solution {
    public boolean isHappy(int n) {
        Set set =new HashSet();
        while (!set.contains(n)|| n!=1){
            set.add(n);
            n = getnextnumber(n);

        }
        return n==1;


    }
    private int  getnextnumber(int tmp) {

            int res = 0;
            while (tmp > 0) {
                res +=  (tmp%10)*(tmp%10);
                tmp = tmp / 10;
            }
            return res;
        }

}
