package sort;

/**
 * 2018/9/13 0:44
 */
public class InsertSort {
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j;
            int temp = arr[i]; //取出第i个数，和前i-1个数比较后，插入合适位置
            //前i-1个数都是由小到大的有序序列，所以只要当前比较的数(arr[j])比temp大，就把这个数后移一位
            for (j = i - 1; j >= 0 && temp < arr[j]; j--){
                arr[j+1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
}
