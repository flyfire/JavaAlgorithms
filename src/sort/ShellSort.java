package sort;

/**
 * Created by houruhou on 21/08/2017.
 */
public class ShellSort implements SortAlgorithm {
    @Override
    public void sort(int[] arr, int start, int end) {
        int len = end - start + 1;
        int gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < end; i++) {
                int flag = arr[i];
                int k = i - gap;
                while (k >= start && arr[k] > flag) {
                    arr[k + gap] = arr[k];
                    k -= gap;
                }
                arr[k + gap] = flag;
            }
            gap = gap / 2;
        }
    }
}
