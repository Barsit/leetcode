import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/10/12 20:39
 * @version:1.0
 */
public class LeetCode_76 {
    private      int[] cnt1 = new int[128];
    private  int[]    cnt2 = new int[128];
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        String result = new String();
        int left = 0;
        String subStr = new String();

        // 统计字符串 t 中各字符的出现次数
        for (char c : t.toCharArray()) {
            cnt2[c]++;
        }
        for(int right = 0; right < s.length(); right++){
            subStr = s.substring(left, right + 1);
            cnt1[s.charAt(right)]++;
            while(SubStrContainsT(subStr ,t)){
                if(result.length() == 0 || subStr.length() < result.length()){
                    result = subStr;
                }
                cnt1[s.charAt(left++)]--;
                subStr = s.substring(left,right + 1);
            }
        }
        return result;
    }
    private boolean SubStrContainsT(String subStr , String t){
        for(int i = 0; i < t.length(); i++){
            if(cnt2[t.charAt(i)] > cnt1[t.charAt(i)]){
                return false;
            }
        }
        return true;
    }

//    private int CountElement(String subStr, char element){
//        int count = 0;
//        for(int i =0; i< subStr.length(); i++ ){
//            if(subStr.charAt(i) == element){
//                count++;
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {
        LeetCode_76 leetCode_76 = new LeetCode_76();
        System.out.println(leetCode_76.minWindow("ADOBECODEBANC", "ABC"));
    }
}
