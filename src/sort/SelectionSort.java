package sort;

/**
 * Created by houruhou on 21/08/2017.
 */
public class SelectionSort implements SortAlgorithm {
    @Override
    public void sort(int[] arr, int start, int end) {
        if (start > end) {
            int tmp = start;
            start = end;
            end = tmp;
        }
        for (int i = start; i < end; i++) {
            int flag = arr[i];
            int flagIndex = i;
            for (int k = i + 1; k < end; k++) {
                if (arr[k] < flag) {
                    flagIndex = k;
                    flag = arr[k];
                }
            }
            if (flagIndex != i) {
                int tmp = arr[i];
                arr[i] = arr[flagIndex];
                arr[flagIndex] = tmp;
            }
        }
    }
}
