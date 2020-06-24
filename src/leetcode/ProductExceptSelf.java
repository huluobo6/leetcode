package leetcode;

/**
 * 238. 除自身以外数组的乘积
 * 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 **/
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int zeroCount = 0;
        for (int num : nums) {
            if (num != 0) {
                total *= num;
            } else {
                zeroCount++;
            }
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (zeroCount >= 2) {
                result[i] = 0;
            } else if (zeroCount == 1) {
                if (num == 0) {
                    result[i] = total;
                } else {
                    result[i] = 0;
                }
            } else {
                result[i] = (total / num);
            }

        }
        return result;
    }
}
