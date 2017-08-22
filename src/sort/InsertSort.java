package sort;

/**
 * Created by houruhou on 21/08/2017.
 */
public class InsertSort implements SortAlgorithm {
    @Override
    public void sort(int[] arr, int start, int end) {
        for (int i = start + 1; i < end; i++) {
            int k = i;
            int flag = arr[k];
            while (k > start && flag < arr[k - 1]) {
                arr[k] = arr[k - 1];
                k--;
            }
            arr[k] = flag;
        }
    }
}
