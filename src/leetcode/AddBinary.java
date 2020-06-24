package leetcode;

/**
 * 67. 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int ca = 0;
        StringBuilder result = new StringBuilder();
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            result.append(sum % 2);
            ca = sum / 2;
        }
        result.append(ca == 1 ? ca : "");
        return result.reverse().toString();
    }
}
