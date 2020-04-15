package leetcode;


/**
 * @author : hxf_life@126.com
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o', 'o'};
        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static void reverseString(char[] s) {
        if (null == s || s.length == 0) {
            return;
        }
        int length = s.length;
        for (int i = 0; i < (length / 2); i++) {
            char temp = s[i];
            int k = length - i - 1;
            s[i] = s[k];
            s[k] = temp;
        }
    }
}
