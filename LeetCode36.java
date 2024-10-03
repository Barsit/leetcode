/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/10/1 20:57
 * @version:1.0
 */
public class LeetCode36 {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++ ){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                boolean rowAndColumn =  checkRowAndColumn(board, i, j);
                boolean block =  checkBlock(board, i, j);
                if(rowAndColumn ==false || block == false){
                    return false;
                }
            }
        }
        return true;

    }
    public boolean  checkRowAndColumn(char[][] board,int row, int column ){
        for(int i = 0; i < 9; i++){
            if(i!=column && board[row][i] == board[row][column]){
                return false;
            }
        }
        for(int j=0; j < 9; j++){
            if(j!= row && board[j][column] == board[row][column]){
                return false;
            }
        }
        return  true;

    }
    public boolean checkBlock(char[][] board,int row, int column){
        for(int i= 3 * ( row / 3); i < 3 * ( row / 3 + 1); i++){
            for(int j= 3 * (column / 3); j < 3 * (column / 3 +1); j++){
                if((i != row && j != column) && board[i][j]== board[row][column]){
                    return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        LeetCode36 solution = new LeetCode36();
        boolean res = solution.isValidSudoku(board);
        System.out.println(res);

    }
}

