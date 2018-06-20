package sort;

/**
 * 2018/6/18 11:03
 * 堆排序的基本思想是：将待排序序列构造成一个大顶堆，此时，整个序列的最大值就是堆顶的根节点。
 * 将其与末尾元素进行交换，此时末尾就为最大值。然后将剩余n-1个元素重新构造成一个堆，这样会得到n个元素的次小值。
 * 升序采用大根堆，降序采用小根堆
 */
public class HeapSort {
    private void adjust(int[] arr, int parent, int n){
        int temp = arr[parent];
        for (int i = 2 * parent + 1; i < n; i = 2 * i + 1){
            int max = i + 1 < n && arr[i] < arr[i + 1] ? i + 1 : i;
            if (temp > arr[max]){
                break;
            }
            arr[parent] = arr[max];
            parent = max;
        }
        arr[parent] = temp;
    }
    private void swap(int[] arr, int parent, int n){
        int temp = arr[parent];
        arr[parent] = arr[n];
        arr[n] = temp;
    }
    public void sort(int[] arr){
        //1.构建大顶堆
        for (int i = arr.length / 2 - 1; i >= 0; --i){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjust(arr,i,arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--){
            swap(arr, 0, i);
            adjust(arr, 0,i);
        }
    }
}
