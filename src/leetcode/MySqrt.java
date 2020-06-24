package leetcode;

public class MySqrt {
    public static int mySqrt(int x) {
        int l = 0;
        int r = x;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
