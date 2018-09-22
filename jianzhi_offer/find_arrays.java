package jianzhi_offer;
/**
 * 2018/7/9 19:31
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 思路：当左上角元素<=目标元素，并且右下角元素>=目标元素时开始寻找
 *       从左下角或者右上角开始比较
 *     每次将二维数组矩阵的中最右上角的数字与要查找的数字比较，基于二维数组从左到右从上到下递增，
 *       当最右上角的数字大于目标数字就可以去掉该列，当最右边的数字小于目标数字的时候就去掉该行，如此遍历查找
 */
public class find_arrays {
    public static boolean Find(int target, int [][] array) {
        /*
            int[] array = null;  声明一数组变量，并赋值 null,nil是一个数组类型的空引用，不指向任何对象；
                虽已初始化，打印“array.length”会出现异常：NullPointerException；(仅一维数组）
            int[] array = new int[0];   声明并创建一数组对象，长度是0；
                打印“array.length”是0，数组内还没有元素。
            if (array == null || 0 == array.length)
                这种写法正确，因为执行到 “0 == array.length”则说明数组不为空，不会产生空指针异常;
            if (0 == array.length || array == null)  这种写法可能会产生空指针异常
         */
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
        int[][] a = null;
        int[][] a1 = new int[5][5];
        int[][] ar = {{}};  //ar.length = 1
        boolean b = Find(t, a1);
        System.out.println(b);
    }
}
