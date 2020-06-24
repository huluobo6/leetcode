package leetcode;

public class GetIntersectionNode {
    public ListNodes getIntersectionNode(ListNodes headA, ListNodes headB) {

        ListNodes h1 = headA;
        ListNodes h2 = headB;

        while (h1 != h2) {
            h1 = h1 == null ? headB : h1.next;
            h2 = h2 == null ? headA : h2.next;
        }

        return h1;
    }

    public static void mian(String[] args) {
        ListNodes headA = new ListNodes(3);
    }
}

class ListNodes {
    int val;
    ListNodes next;

    ListNodes(int x) {
        val = x;
        next = null;
    }
}
