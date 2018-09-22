package sort;

import java.lang.reflect.Array;

/**
 * 2018/9/10 14:42
 */
public class BubbleSort {
    public static void bubbleSort1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j <= arr.length - 1 - i ; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag = true){
                break;
            }
        }
    }
}
