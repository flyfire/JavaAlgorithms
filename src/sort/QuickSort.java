package sort;

/**
 * Created by houruhou on 21/08/2017.
 */
public class QuickSort implements SortAlgorithm {
    @Override
    public void sort(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        int flag = arr[start];
        while (i < j) {
            while (i < j && arr[j] >= flag) {
                j--;
            }
            arr[i] = arr[j];
            while (i < j && arr[i] <= flag) {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = flag;
        if ((i - start) > 1) sort(arr, start, i - 1);
        if ((end - i) > 1) sort(arr, i+1, end);
    }
}
