package isValidSudoku_036;

import java.util.Arrays;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Boolean[] booleans =new Boolean[9];
//判断行
        for (int i = 0; i < 9; i++) {
            Arrays.fill(booleans,false);
            for (int j = 0; j < 9; j++) {
                if (board[i][j]!='.'){
                    int tmp =board[i][j] -'1';
                    if (booleans[tmp]) return false;
                    booleans[tmp]= true;
                }
            }

        }

        for (int i = 0; i < 9; i++) {
            Arrays.fill(booleans, false);
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    int tmp = board[j][i] - '1';
                    if (booleans[tmp]) return false;
                    booleans[tmp] = true;
                }
            }
        }
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3){
                Arrays.fill(booleans, false);
                for (int a = 0; a < 3; a++) {

                    for (int b = 0; b < 3; b++) {
                        if (board[i+a][j+b] != '.') {
                            int tmp = board[i+a][j+b] - '1';//这里注意类型的转换
                            if (booleans[tmp]) return false;
                            booleans[tmp] = true;
                        }
                    }
                }

            }

        }

        return true;//没有返回异常最终 就返回true
    }
}