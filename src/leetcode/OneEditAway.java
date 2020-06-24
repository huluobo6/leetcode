package leetcode;

public class OneEditAway {
    public static boolean oneEditAway(String first, String second) {
        int i = 0;
        int length1 = first.length();
        int length2 = second.length();

        while (i < length1 && i < length2) {
            if (first.charAt(i) == second.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        while (length1 >= 0 && length2 >= 0) {
            if (first.charAt(length1 - 1) == second.charAt(length2 - 1)) {
                length1--;
                length2--;
            } else {
                break;
            }
        }
        if ((length1 - i <= 1) && (length2 - i <= 1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(oneEditAway("pales", "pal"));
    }
}
