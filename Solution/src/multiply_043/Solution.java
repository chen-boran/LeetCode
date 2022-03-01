package multiply_043;

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0"))
            return "0";
        int n = num1.length();
        int m = num2.length();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0;i < n;i ++) a[i] = num1.charAt(n - i - 1) - '0';
        for(int i = 0;i < m;i ++) b[i] = num2.charAt(m - i - 1) - '0';

        int[] c = new int[n + m];
        for(int i = 0;i < n;i ++)
            for(int j = 0;j < m;j ++)
                c[i + j] += a[i] * b[j];

        int t = 0;

        for(int i = 0;i < n + m;i ++)
        {
            t += c[i];
            c[i] = t % 10;
            t /= 10;
        }
        int k = n + m - 1;
        while(k >= 0 && c[k] == 0) k --;
        StringBuilder sb = new StringBuilder("");
        for(int i = k;i >= 0;i --)
            sb.append(c[i]);
        return sb.toString();
    }
}