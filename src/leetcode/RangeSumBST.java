package leetcode;


/**
 * 938. 二叉搜索树的范围和
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 * 二叉搜索树保证具有唯一的值。
 **/
public class RangeSumBST {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; ) {
            result[i] = nums[i];
            result[i + 1] = nums[i + n];
            i += 2;
        }
        return result;

    }

    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 4, 7};
        int n = 3;
        shuffle(array, n);
    }
}
