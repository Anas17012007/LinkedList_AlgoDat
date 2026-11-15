public class Main {
    static void show(String label, LinkedList list) {
        System.out.print(label + ": ");
        list.display();
    }

    public static void main(String[] args) {
        LinkedList data = new LinkedList();
        data.addLast(64);
        data.addLast(34);
        data.addLast(25);
        data.addLast(12);
        data.addLast(22);
        data.addLast(11);
        data.addLast(90);
        data.addLast(5);

        show("Data awal", data);
        System.out.println();

        LinkedList a = data.copy();
        BubbleSort.sort(a);
        show("Bubble Sort   ", a);

        a = data.copy();
        InsertionSort.sort(a);
        show("Insertion Sort", a);

        a = data.copy();
        SelectionSort.sort(a);
        show("Selection Sort", a);

        a = data.copy();
        ShellSort.sort(a);
        show("Shell Sort    ", a);

        a = data.copy();
        MergeSort.sort(a);
        show("Merge Sort    ", a);

        a = data.copy();
        QuickSort.sort(a);
        show("Quick Sort    ", a);
    }
}
