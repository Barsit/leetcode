/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/10/9 20:08
 * @version:1.0
 */
public class LeetCode_977 {
    public int[] sortedSquares(int[] nums) {
        if(nums.length == 1) {
            return new int[]{nums[0] * nums[0]};
        }
        int left = 0;
        int right =nums.length - 1;
        int index = nums.length - 1;
        int[] ans = new int[nums.length];
        while(left  <= right  ){
            if(nums[left] * nums[left] > nums[right]* nums[right]){
                ans[index] = nums[left] * nums[left];
                left++;
            }else{
                ans[index] = nums[right]* nums[right];
                right--;
            }
            index--;

        }

        return ans;

    }

    public static void main(String[] args) {
        LeetCode_977 leetCode_977 = new LeetCode_977();
        int[] nums = {4,-1,0,3,10};
        int[] res = leetCode_977.sortedSquares(nums);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
