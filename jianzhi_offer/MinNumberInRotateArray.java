package jianzhi_offer;

import java.util.ArrayList;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 2018/8/31 14:42
 */
public class MinNumberInRotateArray {

    /**
     *
     * @param array
     * @return 最小元素
     */
    public int minNumberInRotateArray1(int [] array) {
        if (array.length == 0){
            return 0;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return array[i + 1];
        }
        return array[0];
    }

    /**
     * 二分法
     * @param array
     * @return
     * 需要考虑三种情况：
     * (1)array[mid] > array[high]:
     *  类似[3,4,5,6,0,1,2]，此时最小数字一定在mid的右边。
     *  low = mid + 1
     * (2)array[mid] == array[high]:
     *  类似 [1,0,1,1,1] 或者[1,1,1,0,1]，此时最小数字不好判断在mid左边还是右边,只好一个一个试
     *  high = high - 1
     * (3)array[mid] < array[high]:
     *  类似[2,2,3,4,5,6,6],此时最小数字一定就是array[mid]或者在mid的左边。因为右边必然都是递增的。
     *  high = mid
     */
    public int minNumberInRotateArray2(int [] array) {
        int low = 0;
        int high = array.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;   //不使用（low + high）/ 2，数字很大时容易溢出
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return array[low];
    }
}
