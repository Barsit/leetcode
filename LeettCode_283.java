/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/10/5 20:52
 * @version:1.0
 */
public class LeettCode_283 {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;
        int slow = 0;
        int fast = 1;
        while (fast < nums.length && slow < nums.length) {
            if (nums[slow] != 0 && nums[fast] != 0) {
                slow++;
                fast++;
            }
            if (nums[slow] == 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                fast++;
            } else {
                slow++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        LeettCode_283 solution = new LeettCode_283();
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
