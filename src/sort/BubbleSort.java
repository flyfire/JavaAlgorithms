package sort;

/**
 * Created by houruhou on 21/08/2017.
 */
public class BubbleSort implements SortAlgorithm {
    @Override
    public void sort(int[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            boolean exchanged = false;
            for (int j = start; j < end - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    exchanged = true;
                }
            }
            if (!exchanged) {
                break;
            }
        }
    }
}
