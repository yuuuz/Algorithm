package sort;

/**
 * 2018/6/18 9:55
 */
public class QuickSort {
    private int partition(int[] arr, int left, int right){
        int key = arr[left];
        while (left < right){
            while (left < right && arr[right] > key){
                --right;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] < key){
                ++left;
            }
            arr[right] = arr[left];
        }
        arr[left] = key;
        return left;
    }
    //入口
    public void sort(int[] arr){
        sort(arr,0,arr.length - 1);
    }

    private void sort(int[] arr, int left, int right){
        if (left >= right){
            return;
        }
        int middle = partition(arr,left,right);
        sort(arr,left,middle - 1);
        sort(arr,middle + 1, right);
    }
}
