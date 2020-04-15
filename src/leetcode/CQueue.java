package leetcode;

import java.util.Stack;

/**
 * @author : hxf_life@126.com
 */
public class CQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int size;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size = 0;
    }

    public void appendTail(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        size++;
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int deleteHead() {
        if (stack1.isEmpty()) {
            return -1;
        }
        size--;
        return stack1.pop();
    }
}
