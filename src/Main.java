import sort.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("选择排序");
        sort(new SelectionSort());
        System.out.println("冒泡排序");
        sort(new BubbleSort());
        System.out.println("插入排序");
        sort(new InsertSort());
        System.out.println("希尔排序");
        sort(new ShellSort());
        System.out.println("快速排序");
        sort(new QuickSort());
        System.out.println("堆排序");
        sort(new HeapSort());
        System.out.println("归并排序");
        sort(new MergeSort());
    }

    private static void sort(SortAlgorithm sortAlgorithm) {
        int arr[] = {8, 9, 7, 2, 10, 1, 3, 4, 5, 6};
        if (sortAlgorithm instanceof QuickSort || sortAlgorithm instanceof HeapSort || sortAlgorithm instanceof MergeSort) {
            sortAlgorithm.sort(arr, 0, arr.length - 1);
        } else {
            sortAlgorithm.sort(arr, 0, arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n--------------------");
    }
}
