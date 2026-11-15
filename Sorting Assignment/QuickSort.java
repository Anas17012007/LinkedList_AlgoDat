public class QuickSort {
    public static void sort(LinkedList list) {
        list.setHead(sort(list.getHead()));
    }

    private static Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node pivot = head;
        Node current = head.next;
        pivot.next = null;
        Node lessHead = null;
        Node lessTail = null;
        Node moreHead = null;
        Node moreTail = null;
        while (current != null) {
            Node next = current.next;
            current.next = null;
            if (current.value < pivot.value) {
                if (lessHead == null) {
                    lessHead = current;
                } else {
                    lessTail.next = current;
                }
                lessTail = current;
            } else {
                if (moreHead == null) {
                    moreHead = current;
                } else {
                    moreTail.next = current;
                }
                moreTail = current;
            }
            current = next;
        }
        lessHead = sort(lessHead);
        moreHead = sort(moreHead);
        pivot.next = moreHead;
        if (lessHead == null) {
            return pivot;
        }
        Node t = lessHead;
        while (t.next != null) {
            t = t.next;
        }
        t.next = pivot;
        return lessHead;
    }
}
