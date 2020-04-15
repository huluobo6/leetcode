package leetcode;

import java.math.BigDecimal;

/**
 * @author hxf_life@126.com
 * 分割回文数
 * <p>
 * 输入: "aab"
 * 输出:
 * [
 * ["aa","b"],
 * ["a","a","b"]
 * ]
 */
public class NumberOfPalindromes {

    public static void main(String[] args) {
        BigDecimal currentQuotation = new BigDecimal("49710");
        currentQuotation = currentQuotation.subtract(new BigDecimal("41508")).divide(new BigDecimal("49710"), 4, BigDecimal.ROUND_HALF_UP);
        System.out.println(currentQuotation);

        double b = 49710;
        double c = 41508;
        System.out.println((b - c) / b);

    }
}
