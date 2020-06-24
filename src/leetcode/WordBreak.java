package leetcode;

import java.util.List;

public class WordBreak {


    public boolean wordBreak(String s, List<String> wordDict) {
        if (null == s || "".equals(s) || null == wordDict || wordDict.isEmpty()) {
            return false;
        }

        return true;
    }
}
