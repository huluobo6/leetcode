package leetcode;


/**
 * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 *
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * 输出: 3 长度最长的公共子数组是 [3, 2, 1]。
 */
public class FindLength {
    public static int findLength(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;

        int[][] dp = new int[m + 1][n + 1];
        int ans = 0;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                dp[i][j] = A[i] == B[j] ? dp[i + 1][j + 1] + 1 : 0;
                ans = Math.max(dp[i][j], ans);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,2,1};
        int[] b = {3,2,1,4,7};

        findLength(a, b);
    }
}
