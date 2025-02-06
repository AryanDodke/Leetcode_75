package LinkedList;

public class reverseLL {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = current;
            current = head;
            head = next;
        }
        return current;
    }
}
