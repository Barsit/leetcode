/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/10/4 20:48
 * @version:1.0
 */
public class LeetCode367 {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int left = 0;
        int right = num / 2 + 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            long result = (long) mid* mid;
            if( result== num) {
                return true;
            }
            else if(result > num){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;

    }

    public static void main(String[] args) {
//        LeetCode367 solution = new LeetCode367();
//        boolean res = solution.isPerfectSquare(9);
//        System.out.println(res);
        String s = Integer.toString(20, 10);
        System.out.println(s);
    }
}
