package jianzhi_offer;
/**
 * 2018/7/9 19:31
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class find_arrays {
    public static boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0 || array[0].length == 0) return false;
        int row = array.length;
        int col = array[0].length;
        int i = 0, j = col - 1;
        if (array[0][0] <= target && array[row-1][col-1] >= target){
            while (i < row && j >= 0){
                if (array[i][j] < target){
                    i++;
                }else if (array[i][j] > target){
                    j--;
                }else {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int t = 16;
        int[][] ar = {{}};
        boolean b = Find(t, ar);
        System.out.println(b);
    }
}
