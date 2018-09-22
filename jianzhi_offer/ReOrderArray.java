package jianzhi_offer;

import java.util.*;

/**
 * 2018/9/13 19:45
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
    /**
     * 开辟一个新数组
     * @param array
     */
    public void reOrderArray(int [] array) {
        //i找偶数，j找奇数
        int i = 0;
        int[] a = new int[array.length];
        for (int k = 0; k < a.length; k++) {
            if (array[k] % 2 == 1){
                a[i++] = array[k];
            }
        }
        for (int k = 0; k < a.length; k++) {
            if (array[k] % 2 == 0){
                a[i++] = array[k];
            }
        }
        for (int j = 0; j < array.length; j++) {
            array[j] = a[j];
        }
    }
}
