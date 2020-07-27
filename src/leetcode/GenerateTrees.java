package leetcode;

import javax.xml.stream.events.EndDocument;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 95. 不同的二叉搜索树 II
 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树
 * 输入：3
 * 输出：
 * [
 *   [1,null,3,2],
 *   [3,2,null,1],
 *   [3,1,null,null,2],
 *   [2,1,3],
 *   [1,null,2,null,3]
 * ]
 * 解释：
 * 以上的输出对应以下 5 种不同结构的二叉搜索树：
 *
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 * **/
public class GenerateTrees {
    public static List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<TreeNode>();
        }
        List<TreeNode> nodes = generateTrees(1, n);
        return nodes;
    }

    public static List<TreeNode> generateTrees(int begin, int end) {
        List<TreeNode> allTrees = new ArrayList<>();
        if (begin > end) {
            allTrees.add(null);
            return allTrees;
        }
        for (int i = begin; i <= end; i++) {
            List<TreeNode> leftTreeNodes = generateTrees(begin, i - 1);
            List<TreeNode> rightTreeNodes = generateTrees(i + 1, end);

            for (TreeNode left : leftTreeNodes) {
                for (TreeNode right : rightTreeNodes) {
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    allTrees.add(node);
                }
            }
        }
        return allTrees;
    }

    public static void main(String[] args) {
        generateTrees(3);
    }
}
