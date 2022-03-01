package rotate_048;

class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //交换对角线两端的数字
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        //沿中间对称翻折
        for (int i = 0; i < n; i++) {
            for (int j = 0,k = n-1; j < k ; j++,k--) {
                swap(matrix[i][j],matrix[i][k]);

            }

        }

    }
      void swap(int a,int b){
        int tmp = a ;
        a= b;
        b=tmp;

    }
}