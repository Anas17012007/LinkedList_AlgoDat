public class MergeSort {
    public static void sort(int[] a) {
        if (a.length < 2) {
            return;
        }
        int[] temp = new int[a.length];
        sort(a, temp, 0, a.length - 1);
    }

    private static void sort(int[] a, int[] temp, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        sort(a, temp, left, mid);
        sort(a, temp, mid + 1, right);
        merge(a, temp, left, mid, right);
    }

    private static void merge(int[] a, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= right) {
            temp[k++] = a[j++];
        }
        for (int x = left; x <= right; x++) {
            a[x] = temp[x];
        }
    }
}
