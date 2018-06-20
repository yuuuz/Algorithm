package sort;


/**
 * 2018/6/18 10:21
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{8,15,3,5,4,11,2,6,9};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        for (int i:arr) {
            System.out.print(i + " ");
        }
//        HeapSort heapSort = new HeapSort();
//        heapSort.sort(arr);
//        for (int i:arr) {
//            System.out.print(i + " ");
//        }
    }
}
