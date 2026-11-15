public class Main {
    static int[] copy(int[] a) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        return c;
    }

    static void print(String label, int[] a) {
        System.out.print(label + ": ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90, 5};

        print("Data awal", data);
        System.out.println();

        int[] a = copy(data);
        BubbleSort.sort(a);
        print("Bubble Sort   ", a);

        a = copy(data);
        InsertionSort.sort(a);
        print("Insertion Sort", a);

        a = copy(data);
        SelectionSort.sort(a);
        print("Selection Sort", a);

        a = copy(data);
        ShellSort.sort(a);
        print("Shell Sort    ", a);

        a = copy(data);
        MergeSort.sort(a);
        print("Merge Sort    ", a);

        a = copy(data);
        QuickSort.sort(a);
        print("Quick Sort    ", a);
    }
}
