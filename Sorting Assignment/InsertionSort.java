public class InsertionSort {
    public static void sort(LinkedList list) {
        Node current = list.getHead();
        Node sorted = null;
        while (current != null) {
            Node next = current.next;
            if (sorted == null || current.value < sorted.value) {
                current.next = sorted;
                sorted = current;
            } else {
                Node p = sorted;
                while (p.next != null && p.next.value <= current.value) {
                    p = p.next;
                }
                current.next = p.next;
                p.next = current;
            }
            current = next;
        }
        list.setHead(sorted);
    }
}
