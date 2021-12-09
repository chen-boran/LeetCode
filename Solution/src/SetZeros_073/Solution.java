package SetZeros_073;

class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length==0 ) return;
        int m =matrix.length,n =matrix[0].length;

        int col0 = 1, row0 = 1;
        //循环判断第一行第一列是否有0
        //列
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) col0 =0;
        }
        //第一行
        for (int j=0 ;j< n; j++){
            if (matrix[0][j]==0 ) row0 = 0;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] ==0 ){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[i][0]==0){
                for (int j = 0; j < n; j++) {
                    matrix[i][j]=0;

                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (matrix[i][0]==0){
                for (int j = 0; j < m; j++) {
                    matrix[i][j]=0;

                }
            }
        }
        if (col0 ==0)
            for (int i = 0; i < n; i ++ )
                matrix[i][0] = 0;

        if (row0==0)
            for (int i = 0; i < m; i ++ )
                matrix[0][i] = 0;
    }


}

