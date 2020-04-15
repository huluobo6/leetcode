package leetcode;

import java.util.ArrayList;
import java.util.List;


/**
 * @author : hxf_life@126.com
 */
class Trie {

    private List<String> value;

    /**
     * Initialize your data structure here.
     */
    public Trie() {

    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (word == null) {
            return;
        }
        if (value == null) {
            value = new ArrayList<>();
        }
        value.add(word);
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        if (value == null || word == null) {
            return false;
        }
        if (value.contains(word)) {
            return true;
        }
        return false;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        if (value == null || prefix == null) {
            return false;
        }
        for (String str : value) {
            if (str.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Trie obj = new Trie();
        String word = "word";
        String prefix = "wors";
        obj.insert(word);
        boolean param_2 = obj.search(word);
        boolean param_3 = obj.startsWith(prefix);
        System.out.println("" + param_2 + param_3);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

