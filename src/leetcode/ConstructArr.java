package leetcode;

/**
 * @author : hxf_life@126.com
 */
public class ConstructArr {
    public static int[] constructArr(int[] a) {
        int[] array = {};
        int[] left = {};
        int[] right = {};
        if (a == null || a.length == 0) {
            return array;
        }

        int length = a.length;
        array = new int[length];
        left = new int[length];
        right = new int[length];
        int b = 1;
        int c = 1;
        for (int j = 0; j < length; j++) {
            left[j] = b;
            b = b * a[j];
        }

        for (int p = (length - 1); p >= 0; p--) {
            right[p] = c;
            c = c * a[p];
        }

        for (int i = 0; i < length; i++) {
            array[i] = left[i] * right[i];
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] a = constructArr(array);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }

}
