package leetcode;

public class Merge {
    /**
     * 面试题 10.01. 合并排序的数组
     * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
     * 初始化 A 和 B 的元素数量分别为 m 和 n。
     * 示例:
     * 输入:
     * A = [1,2,3,0,0,0], m = 3
     * B = [2,5,6],       n = 3
     * 输出: [1,2,2,3,5,6]
     * 说明:
     * A.length == n + m
     **/
    public void merge(int[] A, int m, int[] B, int n) {
        int length = m + n - 1;
        while (m > 0 || n > 0) {
            if (m <= 0) {
                A[length] = B[n - 1];
                length--;
                n--;
                continue;
            }
            if (n <= 0) {
                A[length] = A[m - 1];
                length--;
                m--;
                continue;
            }
            if (A[m - 1] >= B[n - 1]) {
                A[length] = A[m - 1];
                m--;
            } else {
                A[length] = B[n - 1];
                n--;
            }
            length--;
        }
    }
}
