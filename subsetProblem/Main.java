package subsetProblem;

/**
 * 2018/4/2 22:18
 *穷举
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt(), m = scanner.nextInt();
            boolean isOk = false;
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0, x; i < n; i++) {
                if ((x = scanner.nextInt()) <= m)
                    arr.add(x);                   //初始化
            }
            //n个元素的子集个数为2^n,包含空集和自身
            //1左移n位相当于2的n次方
<<<<<<< HEAD
            for (int i = 0; i < (1 << arr.size()); i++) {
=======
            for (int i = 0; i < (1 << arr.size()); i++) {  
>>>>>>> 5d152ba45aa602eda3980a26f9c4eebba22a2cf2
                int sum = 0;
                //00000~11111
                for (int bit = 0; bit < arr.size(); bit++) {
                    //10011,第一个数，第四个数，第五个数之和
                    if ((i & (1 << bit)) != 0)
                        sum += arr.get(bit);
                }
                if (sum == m) {
                    isOk = true;
                    break;
                }
            }
            System.out.println(isOk ? "perfect" : "good");
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 5d152ba45aa602eda3980a26f9c4eebba22a2cf2
