package leetcode;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 **/
public class MyPow {
    public static double myPow(double x, int n) {
        long s = n;
        if (n < 0) {
            s = -n;
            x = 1 / x;
        }
        return pow(x, s);
    }

    public static double pow(double x, long n) {
        if (n == 0) {
            return 1;
        }
        double m = pow(x, n / 2);
        if (n % 2 == 0) {
            return m * m;
        } else {
            return m * m * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(0.00001, 2147483647));
    }
}
