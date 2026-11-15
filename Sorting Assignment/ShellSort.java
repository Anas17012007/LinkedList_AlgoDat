public class ShellSort {
    public static void sort(LinkedList list) {
        int n = list.size();
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = nodeAt(list, i).value;
                int j = i;
                while (j >= gap && nodeAt(list, j - gap).value > temp) {
                    nodeAt(list, j).value = nodeAt(list, j - gap).value;
                    j -= gap;
                }
                nodeAt(list, j).value = temp;
            }
        }
    }

    private static Node nodeAt(LinkedList list, int index) {
        Node current = list.getHead();
        for (int k = 0; k < index; k++) {
            current = current.next;
        }
        return current;
    }
}
