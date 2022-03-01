package spiralOrder_054;

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int index = matrix.length;
        int C = matrix[0].length;
        List<Integer> ans =new ArrayList<>();
        if( index ==0) return ans;

        int[] a ={1,0,-1,0};
        int[] b = {0,1,0,-1};
        int x=0,y =0 ;
        int direction =0 ;//表示方向
        Boolean[][] count = new Boolean[index][C];
        for(int i =0; i< index * C ;i++){
            ans.add(matrix[x][y]);
            count[x][y] = true;
            int tmp1 = x+a[direction];
            int tmp2 = y+a[direction];
            if(tmp1<0 || tmp1 >=index || tmp2 <0 ||tmp2 >= C ||count[tmp1][tmp2]==true  ){
                direction =( direction +1) %4;

            }
            x = tmp1;y = tmp2;
        }
    return  ans;
    }
}
