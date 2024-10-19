import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/10/2 21:25
 * @version:1.0
 */
public class LeetCode69 {
    public int mySqrt(int x) {
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MAX_VALUE);
        if(x==0 || x== 1) return x;
        int left = 0;
        int right = (x / 2) + 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            long reslut =  (long) mid * mid;
            long reslut1 =(long)(mid + 1) * (mid + 1);
            if( reslut== x || (reslut < x && reslut1 > x)){
                return mid;
            }
            else if(reslut < x){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        LeetCode69 solution = new LeetCode69();
        int res = solution.mySqrt(2147483647);
        System.out.println(res);
        List<Integer> objects = new ArrayList<>(10);
        new Vector<>(10);
    }
}
