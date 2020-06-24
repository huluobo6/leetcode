package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 974. 和可被 K 整除的子数组
 * 给定一个整数数组 A，返回其中元素之和可被 K 整除的（连续、非空）子数组的数目。
 * <p>
 * 输入：A = [4,5,0,-2,-3,1], K = 5
 * 输出：7
 * 解释：
 * 有 7 个子数组满足其元素之和可被 K = 5 整除：
 * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
 **/
public class SubarraysDivByK {
    public static int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> record = new HashMap<>(16);
        record.put(0, 1);
        int total = 0;
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            int num = A[i];
            total += num;
            int modulus = (total % K + K) % K;
            int same = record.getOrDefault(modulus, 0);
            ans += same;
            record.put(modulus, same + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 0, -2, -3, 1};
        System.out.println(subarraysDivByK(array, 5));
    }
}
