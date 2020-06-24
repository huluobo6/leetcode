package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    private List<Integer> list = null;

    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        if (list == null || list.isEmpty()) {
            return;
        }
        list.remove(list.size() - 1);
    }

    public int top() {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return list.get(list.size() - 1);
    }

    public int min() {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int min = list.get(0);
        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    /**
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.min();
     */

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.min();
        minStack.top();
        System.out.println(minStack.top() + "===" + minStack.min());
        minStack.pop();
        System.out.println(minStack.top() + "===" + minStack.min());
        minStack.min();
    }
}
