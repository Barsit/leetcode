/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/10/5 20:16
 * @version:1.0
 */
public class LeetCode_26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int slow = 0;
        int fast = 1;
        while(fast < nums.length){
            if(nums[slow]==nums[fast]){
                fast++;
            }else{
                nums[++slow] =nums[fast];
                fast++;
            }
        }
        return slow + 1;

    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        LeetCode_26 solution = new LeetCode_26();
        int res = solution.removeDuplicates(nums);
        System.out.println(res);
    }
}
