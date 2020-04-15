package leetcode;

/**
 * @author : hxf_life@126.com
 */
public class CountDigitOne {
    public static int countDigitOne(int n) {
        int count = 0;
        for (int i = n; i > 0; i--) {
            int k = i;
            while (k > 0) {
                if ((k % 10) == 1) {
                    count++;
                }
                k = k / 10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        System.out.println(countDigitOne(824883294));
        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time1) + "ms");
    }
}
