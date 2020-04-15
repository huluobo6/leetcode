package leetcode;


import java.util.Arrays;

/***
 * 21. 调整数组顺序使奇数位于偶数前面
 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 示例：
 输入：nums = [1,2,3,4]
 输出：[1,3,2,4]
 注：[3,1,2,4] 也是正确的答案之一。
 提示：

 1 <= nums.length <= 50000
 1 <= nums[i] <= 10000
 * */

/**
 * @author : hxf_life@126.com
 */
public class SortArray {
    public int[] exchange(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int oddNum = 0;
        int evenNum = length - 1;
        for (int i = 0; i < length; i++) {
            if (nums[i] % 2 == 1) {
                result[oddNum++] = nums[i];
            } else {
                result[evenNum--] = nums[i];
            }
        }
        Arrays.sort(nums);
        return result;
    }
}
