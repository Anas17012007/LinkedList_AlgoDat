public class MergeSort {
    public static void sort(LinkedList list) {
        list.setHead(sort(list.getHead()));
    }

    private static Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = middle(head);
        Node right = mid.next;
        mid.next = null;
        return merge(sort(head), sort(right));
    }

    private static Node middle(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while (a != null && b != null) {
            if (a.value <= b.value) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a != null) {
            tail.next = a;
        } else {
            tail.next = b;
        }
        return dummy.next;
    }
}
