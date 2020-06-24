package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        if (null == s || s.length() == 0) {
            return -1;
        }
        int length = s.length();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < length; i++) {
            char chars = s.charAt(i);
            if (map.containsKey(chars)) {
                map.put(chars, map.get(chars) + 1);
            } else {
                map.put(chars, 1);
            }
        }
        char findKey = '\000';
        for (char key : map.keySet()) {
            int value = map.get(key);
            if (value == 1) {
                findKey = key;
                break;
            }
        }
        return s.indexOf(findKey);
    }
}
