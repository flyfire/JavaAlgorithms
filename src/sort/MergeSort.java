package sort;

/**
 * Created by houruhou on 22/08/2017.
 */
public class MergeSort implements SortAlgorithm {
    @Override
    public void sort(int[] arr, int start, int end) {
        if (arr == null || start >= end)
            return;
        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    static void merge(int arr[], int start, int mid, int end) {
        int[] tmp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = arr[i++];
        }

        while (j <= end) {
            tmp[k++] = arr[j++];
        }
        for (int i1 = 0; i1 < k; i1++) {
            arr[start + i1] = tmp[i1];
        }
        tmp = null;
    }
}
