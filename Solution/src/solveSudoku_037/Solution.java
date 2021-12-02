package solveSudoku_037;

class Solution {
    static boolean dfs(char[][] board,boolean[][] row,boolean[][] col,boolean[][][] cell,int x,int y)
    {
        //判断边界
        if(y == 9)
        {
            x ++;
            y = 0;
            if(x == 9) return true;

        }
        if(board[x][y] != '.') return dfs(board,row,col,cell,x,y + 1);//该位置已经被表示过，则直接跳去下一个位置

        //若该位置未被表示过，则往该位置尝试填1 到 9 的数字
        for(int i = 1;i <= 9;i ++)
        {
            if(row[x][i] || col[y][i] || cell[x / 3][y / 3][i]) continue;//
            board[x][y] = (char)('0' + i);//尝试填数
            row[x][i] = col[y][i] = cell[x / 3][y / 3][i] = true;//并在row，col，cell数组中进行标记
            if(dfs(board,row,col,cell,x,y + 1)) return true;
            //如果dfs当前结果不正确，就要恢复现场
            board[x][y] = '.';
            row[x][i] = col[y][i] = cell[x / 3][y / 3][i] = false;
        }
        return false;
        //当不能到达最后一个位置，直接返回false，结束递归
    }

    public void solveSudoku(char[][] board) {
        boolean[][] row = new boolean[10][10];
        boolean[][] col = new boolean[10][10];
        boolean[][][] cell = new boolean[3][3][10];

        //初始化，预处理出row，col，cell数组，已经出现的位置标记成true
        for(int i = 0;i < 9;i ++)
            for(int j = 0;j < 9;j ++)
            {
                if(board[i][j] != '.')
                {
                    int t = board[i][j] - '0';
                    row[i][t] = col[j][t] = cell[i / 3][j / 3][t] = true;
                }
            }

        dfs(board,row,col,cell,0,0);
    }
}



