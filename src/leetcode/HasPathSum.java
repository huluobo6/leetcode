package leetcode;


/**
 * 112. 路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 * 示例: 
 * 给定如下二叉树，以及目标和 sum = 22
 *                5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * **/
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        return fbs(root, sum, 0);
    }

    public boolean fbs (TreeNode root, int sum, int count) {
        if (root == null) {
            return false;
        }
        count += root.val;
        if (root.left == null && root.right == null) {
            return sum == count;
        }
        return fbs(root.left, sum, count) || fbs(root.right, sum, count);
    }
}
