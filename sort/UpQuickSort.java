package sort;

import java.util.Arrays;
import java.util.List;

/**
 * 2018/6/20 15:47
 */
public class UpQuickSort {
    private static <E> int partition(List<E> list, int left, int right,Compare<E> compare){
        E key = list.get(left);
        while (left < right){
            while (left < right && compare.compare(key, list.get(right)) < 0){
                --right;
            }
            list.set(left,list.get(right));
            while (left < right && compare.compare(key, list.get(left)) > 0){
                ++left;
            }
            list.set(right,list.get(left));
        }
        list.set(left,key);
        return left;
    }

    public static <E> void sort(List<E> list, Compare<E> compare) {
        sort(list,0,list.size() - 1, compare);
    }

    private static <E> void sort(List<E> list, int left, int right, Compare<E> compare){
        if (left >= right){
            return;
        }
        int middle = partition(list,left,right,compare);
        sort(list,left,middle - 1,compare);
        sort(list,middle + 1, right,compare);
    }
    public static void main(String[] args) {
        Integer[] datas = new Integer[] {72, 6, 57, 88, 60, 42, 83, 73, 48, 85};

        UpQuickSort.sort(Arrays.asList(datas), new Compare<Integer>() {
            @Override
            public int compare(Integer value1, Integer value2) {
                return value1 - value2;
            }
        });
        System.out.println(Arrays.asList(datas));
    }
}
