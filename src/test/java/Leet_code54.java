import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/10/18 14:56
 * @version:1.0
 */
public class Leet_code54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col =matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int start_x = 0,start_y = 0;
        // int offset = 1;
        // int loop =1;
        int i_matrix,j_matrix;
        int count = 0;
        while(count< row * col){
            for(j_matrix = start_y;j_matrix < col; j_matrix++){
                ans.add(matrix[start_x][j_matrix]);
                count++;
                if(count == row * col){
                   return ans;
                }
            }
            j_matrix--;
            for(i_matrix =start_x + 1; i_matrix < row;i_matrix++){
                ans.add(matrix[i_matrix][j_matrix]);
                count++;
                if(count == row * col){
                    return ans;
                }
            }
            i_matrix--;
            j_matrix--;
            for(;j_matrix >= start_y;j_matrix--){
                ans.add(matrix[i_matrix][j_matrix]);
                count++;
                if(count== row * col){
                    return ans;
                }
            }
            j_matrix++;
            i_matrix--;
            for(;i_matrix > start_x;i_matrix--){
                ans.add(matrix[i_matrix][j_matrix]);
                count++;
                if(count== row * col){
                    return ans;
                }
            }
            i_matrix++;
            start_x++;
            start_y++;
        }
        return ans;
    }

    public List<Integer> generateMatrix(int[][] matrix) {
        int row = matrix.length;
        int col =matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int startX = 0, startY = 0;  // 每一圈的起始点
        int offsetX = row > col?  1: col - row +1 ;
        int offsetY = col > row?  1: row - col +1;
        int count = 0;  // 矩阵中需要填写的数字
        int loop = 1; // 记录当前的圈数
        int i, j; // j 代表列, i 代表行;
        int n = Math.max(row, col);
        while (loop <= n / 2) {
            // 顶部
            // 左闭右开，所以判断循环结束时， j 不能等于 n - offset
            for (j = startY; j < n - offsetY; j++) {
                ans.add(matrix[startX][j]);
//                count++;
//                if (count == row * col) {
//                    return ans;
//                }
            }

            // 右列
            // 左闭右开，所以判断循环结束时， i 不能等于 n - offset
            for (i = startX; i < n - offsetX; i++) {
                ans.add(matrix[i][j]);
//                count++;
//                if (count == row * col) {
//                    return ans;
//                }
            }

            // 底部
            // 左闭右开，所以判断循环结束时， j != startY
            for (; j > startY; j--) {
                ans.add(matrix[i][j]);
                count++;
//                if (count == row * col) {
//                    return ans;
//                }
            }

            // 左列
            // 左闭右开，所以判断循环结束时， i != startX
            for (; i > startX; i--) {
                ans.add(matrix[i][j]);
                count++;
//                if (count == row * col) {
//                    return ans;
//                }
            }
            startX++;
            startY++;
            offsetX++;
            offsetY++;
            loop++;
        }
        if (n % 2 == 1) { // n 为奇数时，单独处理矩阵中心的值
            ans.add(matrix[startX][startY]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Leet_code54 leet_code54 = new Leet_code54();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(leet_code54.generateMatrix(matrix));
        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(leet_code54.generateMatrix(matrix2));


    }
}
