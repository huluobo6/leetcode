package leetcode;


/**
 * 209. 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度。如果不存在符合条件的连续子数组，返回 0。
 * <p>
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 */
public class MinSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        int start = 0;
        int end = 0;

        int ans = Integer.MAX_VALUE;
        int num = 0;
        while (end < nums.length) {
            num += nums[end];
            while (num >= s) {
                ans = Math.min(end - start + 1, ans);
                num -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
