/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/10/19 10:03
 * @version:1.0
 */
public class LeetCode146 {
    public int[] spiralArray(int[][] array) {

        int row = array.length;
        if(row == 0) return new int[]{};
        if(row==1) return array[0];
        int col =array[0].length;
        int[] ans = new int[row*col];
        if(col == 1){
            for(int i =0; i < row;i++){
                ans[i] = array[i][0];
            }
            return ans;
        }
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
                ans[count++] = array[startX][j];
                if(count == row * col){
                    return ans;
                }
            }

            // 右列
            // 左闭右开，所以判断循环结束时， i 不能等于 n - offset
            for (i = startX; i < n - offsetX; i++) {
                ans[count++] =array[i][j];
                if(count == row * col){
                    return ans;
                }
            }

            // 底部
            // 左闭右开，所以判断循环结束时， j != startY
            for (; j > startY; j--) {
                ans[count++] =array[i][j];
                if(count == row * col){
                    return ans;
                }
            }

            // 左列
            // 左闭右开，所以判断循环结束时， i != startX
            for (; i > startX; i--) {
                ans[count++] = array[i][j];
                if(count == row * col){
                    return ans;
                }
            }
            startX++;
            startY++;
            offsetX++;
            offsetY++;
            loop++;
        }
        if (n % 2 == 1 && count < row * col) { // n 为奇数时，单独处理矩阵中心的值
            ans[count]=array[startX][startY];
        }
        return ans;

    }

    public static void main(String[] args) {
        LeetCode146 leetCode146 = new LeetCode146();
        int[] ans = leetCode146.spiralArray(new int[][]{{2,3,4},{5,6,7,},{8,9,10},{11,12,13},{14,15,16}});
        for(int i : ans){
            System.out.println(i);
        }
    }
}
