public class BubbleSort {
    public static void sort(LinkedList list) {
        Node head = list.getHead();
        if (head == null || head.next == null) {
            return;
        }
        Node end = null;
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != end) {
                if (current.value > current.next.value) {
                    int t = current.value;
                    current.value = current.next.value;
                    current.next.value = t;
                    swapped = true;
                }
                current = current.next;
            }
            end = current;
        } while (swapped);
    }
}
