public class SelectionSort {
    public static void sort(LinkedList list) {
        Node i = list.getHead();
        while (i != null && i.next != null) {
            Node min = i;
            Node j = i.next;
            while (j != null) {
                if (j.value < min.value) {
                    min = j;
                }
                j = j.next;
            }
            if (min != i) {
                int t = i.value;
                i.value = min.value;
                min.value = t;
            }
            i = i.next;
        }
    }
}
