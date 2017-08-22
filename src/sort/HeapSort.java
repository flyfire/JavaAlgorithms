package sort;

/**
 * Created by houruhou on 21/08/2017.
 */
public class HeapSort implements SortAlgorithm {
    @Override
    public void sort(int[] arr, int start, int end) {
        buildMaxHeap(arr, start, end);
        for (int i = end; i>start; i--){
            int tmp = arr[start];
            arr[start] = arr[i];
            arr[i] = tmp;
            siftDown(arr, start, i-1);
        }
    }


    static void buildMaxHeap(int arr[], int start, int end) {
        int nonLeafNode = (end + 1 - start) / 2 + start;
        for (int i = nonLeafNode; i >= start; i--) {
            siftDown(arr, i, end);
        }
    }

    static void siftDown(int arr[], int i, int end) {
        int flag = arr[i];
        int flagIndex = i;
        int leftNode = 2 * i;
        while (leftNode < end) {
            if (leftNode < (end - 1) && arr[leftNode] < arr[leftNode + 1])
                leftNode++;
            if (flag < arr[leftNode]) {
                arr[flagIndex] = arr[leftNode];
                flagIndex = leftNode;
                leftNode = leftNode * 2;
            } else {
                break;
            }
        }
        arr[flagIndex] = flag;
    }
}
