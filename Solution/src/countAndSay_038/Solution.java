package countAndSay_038;

class Solution {
    public String countAndSay(int n) {
        String a = "1";

        for (int i = 0; i < n-1; i++) {
            String tmp ="";
            for (int j = 0; j < a.length();j++){
                int k = j ;
                while( k< a.length() && a.charAt(k)==a.charAt(j)) k++;

                tmp +=""+(k-j) + a.charAt(j);
                j=k-1;

            }
            a = tmp;
        }
        return a;
    }
}