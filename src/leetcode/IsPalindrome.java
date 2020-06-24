package leetcode;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 **/
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        int begin = 0;
        int end = s.length() - 1;
        s = s.toLowerCase();
        while (begin < end) {
            char start = s.charAt(begin);
            char over = s.charAt(end);
        }
        // TODO: 2020/6/24
        return true;
    }
}
