import java.util.Arrays;

/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/10/1 19:33
 * @version:1.0
 */
public class LeetCode34_binarySearch {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if(n ==0 ) {
            return new int[]{-1, -1};
        }
        int first = findFirstTarget(nums, target);
        if(first == -1){
            return new int[]{-1, -1};
        }
        int last = findLastTarget(nums, target);
        return new int[]{first,last};

    }
    public int findFirstTarget(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left < right ){
//           希望往左边找，向下取整
            int mid = (left + right + 1) / 2;
            if(nums[mid]>target){
                right = mid - 1;

            }else if(nums[mid] == target ){
                right = mid;

            }else{
                left = mid + 1;
            }
        }
        if(nums[left] == target){
            return left;
        }else{
            return -1;
        }

    }
    public int findLastTarget(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left < right ){
//            希望右边找，向上取整
            int mid = (left + right + 1) / 2;
            if(nums[mid]>target){
                right = mid - 1;

            }else if(nums[mid] == target ){
                left = mid;

            }else{
                left = mid + 1;
            }
        }
        if(nums[right] == target){
            return right;
        }else{
            return -1;
        }

    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        LeetCode34_binarySearch solution = new LeetCode34_binarySearch();
        int[] res = solution.searchRange(nums, target);
        System.out.println(Arrays.toString(res));
    }
}