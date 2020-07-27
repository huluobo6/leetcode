package leetcode;
/**
 * 1528. 重新排列字符串
 * 给你一个字符串 s 和一个 长度相同 的整数数组 indices 。
 * 请你重新排列字符串 s ，其中第 i 个字符需要移动到 indices[i] 指示的位置。
 * 返回重新排列后的字符串。
 *
 * 示例 1：
 * 输入：s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * 输出："leetcode"
 * 解释：如图所示，"codeleet" 重新排列后变为 "leetcode" 。
 * 示例 2：
 * 输入：s = "abc", indices = [0,1,2]
 * 输出："abc"
 * 解释：重新排列后，每个字符都还留在原来的位置上。
 */

public class RestoreString {
    public String restoreString(String s, int[] indices) {
        if (s == null || s.length() == 0) {
            return "";
        }
        char[] ans = new char[indices.length];
        for (int i = 0; i < s.length(); i++) {
            ans[indices[i]] = s.charAt(i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ans.length; i++) {
            sb.append(ans[i]);
        }
        return sb.toString();
    }
}
