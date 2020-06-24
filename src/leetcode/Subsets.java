package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> current = new ArrayList<>();
            for (List<Integer> list : result) {
                current.add(new ArrayList<Integer>(list) {{
                    add(num);
                }});
            }
            for (List<Integer> curr : current) {
                result.add(curr);
            }
        }
        return result;
    }

}
