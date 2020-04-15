package leetcode;

/**
 * @author : hxf_life@126.com
 */
public class Masseur {
    public static int massage(int[] nums) {
        int numsLength = nums.length;
        if (nums == null || numsLength == 0) {
            return 0;
        }
        if (numsLength == 1) {
            return nums[0];
        }
        int[] db = new int[numsLength];
        db[0] = nums[0];
        db[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < numsLength; i++) {
            db[i] = Math.max(db[i - 1], db[i - 2] + nums[i]);
        }
        return db[numsLength - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        massage(nums);
    }
}
