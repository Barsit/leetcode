import java.util.Arrays;

/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/9/30 20:18
 * @version:1.0
 */
/* description
34. 在排序数组中查找元素的第一个和最后一个位置
已解答
中等
相关标签
相关企业
给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。

如果数组中不存在目标值 target，返回 [-1, -1]。

你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 * param
 * return
 * author db
 * createTime 2024/9/30 21:25
*/
public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1, -1};
        }
        int l = 0, r = nums.length - 1;
        int record_l = -1, record_r = -1;
        while(l <nums.length){
            if(nums[l] == target){
                if(record_l == -1 ){
                    record_l = l;
                }
                if(record_r == -1){
                    record_r = l;
                }
                else{
                    record_r = Math.max(record_r,l);
                }
            }
            l++;
        }
        if(record_l != -1 && record_r != -1){
            return new int[]{record_l,record_r};
        }
        if(record_l != -1 && record_r == -1){
            return new int[]{record_l, record_l};
        }
        if(record_l == -1 && record_r != -1){
            return new int[]{record_r, record_r};
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        LeetCode34 solution = new LeetCode34();
        int[] res = solution.searchRange(nums, target);
        System.out.println(Arrays.toString(res));

    }
}