/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/10/12 19:03
 * @version:1.0
 */
public class LeetCode_5 {

    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        int left = 0;
        String subString = new String();
        String result = new String();
        for(int right = 0; right < s.length(); right++){
            subString = s.substring(left, right +1 );
            while(!isPalindromic(subString)){
                subString = s.substring(++left, right + 1);
            }
            result = subString.length() > result.length() ? subString : result;
        }
        return result;
    }
    private boolean isPalindromic(String subString){
        int left = 0 ;
        int right = subString.length() -1;
        while(left < right){
            if(subString.charAt(left)== subString.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "babad";
//       获取字符串中某个元素出现的次数
        LeetCode_5 leetCode_5 = new LeetCode_5();
        System.out.println(leetCode_5.longestPalindrome(s));
    }
}
