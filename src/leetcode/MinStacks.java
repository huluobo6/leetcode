package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinStacks {
    /**
     * initialize your data structure here.
     */
    List<Integer> list = null;
    List<Integer> minList = null;

    public MinStacks() {
        list = new ArrayList<>();
        minList = new ArrayList<>();
    }

    public void push(int x) {
        if (list == null) {
            new MinStacks();
        }
        list.add(x);
        if (minList.isEmpty()) {
            minList.add(x);
        } else if (minList.get(minList.size() - 1) >= x) {
            minList.add(x);
        }
    }

    public void pop() {
        if (list != null) {
            if (minList.get(minList.size() - 1).equals(list.get(list.size() - 1))) {
                minList.remove(minList.size() - 1);
            }
            list.remove(list.size() - 1);
        }
    }

    public int top() {
        if (list != null) {
            return list.get(list.size() - 1);
        }
        return -1;
    }

    public int getMin() {
        if (list != null) {
            return minList.get(minList.size() - 1);
        }
        return -1;
    }


    public static void main(String[] args) {
        MinStacks minStack = new MinStacks();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        minStack.getMin();
        minStack.top();
        System.out.println(minStack.top() + "===" + minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top() + "===" + minStack.getMin());
        minStack.getMin();
    }
}
