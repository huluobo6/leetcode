package leetcode;

/**
 * 101. 对称二叉树
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 **/
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return symmetric(root.left, root.right);
    }

    public boolean symmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if ((left.val == right.val) && symmetric(left.left, right.right) && symmetric(left.right, right.left)) {
            return true;
        }
        return false;
    }
}
