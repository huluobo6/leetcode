package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MiddleNode {

    public static ListNode middleNode(ListNode head) {

        List<ListNode> array = new ArrayList<>();
        while (head.next != null) {
            array.add(head);
            head = head.next;
        }
        array.add(head);
        int size = array.size();
        int index = (size / 2) + 1;
        System.out.println(array.get(index - 1).val);
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        head.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = null;
        middleNode(head);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
