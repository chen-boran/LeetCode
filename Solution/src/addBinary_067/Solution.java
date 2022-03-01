package addBinary_067;

/**
 * @author ASUS
 * @ 2021/12/8- 19:48
 */
class Solution {
    public String addBinary(String a, String b) {
        int ans =0 ;

        for (int i = a.length()-1,n =1 ; i >=0 ; i--) {
            ans += a.charAt(i)* n ;
            n*=2;
        }

        for (int i = b.length()-1,n= 1; i >=0 ; i--) {
            ans += b.charAt(i) * n;
            n*=2;
        }


        String string = Integer.toBinaryString(ans);
        return string;
    }
}
