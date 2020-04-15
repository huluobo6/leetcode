package leetcode;

/**
 * @author : hxf_life@126.com
 */
public class ReplaceSpace {

    public static String replaceSpace(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append("20%");
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        replaceSpace("we are friend");
    }
}
