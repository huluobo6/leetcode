package leetcode;

public class ReverseWords1 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(new StringBuffer(word).reverse().toString() + " ");
        }
        return res.toString().trim();
    }
}
