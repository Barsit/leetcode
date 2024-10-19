import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/10/16 21:35
 * @version:1.0
 */
public class LeetCode_904 {
    public int totalFruit(int[] fruits) {
        if(fruits.length == 1) return 1;
        Map<Integer,Integer> basket = new HashMap<>();
        int result = Integer.MIN_VALUE;
        int left = 0;
        for(int right = 0; right < fruits.length; right++){
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
            while(basket.size() > 2){
                if(basket.get(fruits[left]) == 1){
                    basket.remove(fruits[left]);
                }
                else{
                    basket.put(fruits[left],basket.get(fruits[left]) - 1 );
                }
                left++;

            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode_904 leetCode_904 = new LeetCode_904();
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(leetCode_904.totalFruit(fruits));

    }
}

