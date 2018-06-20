package subsetProblem;

/**
 * 2018/4/2 21:38
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BackTracking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        BackTracking backTracking = new BackTracking();
        System.out.println(backTracking.getSubSet(a,m,0));
    }
    //存放求取子集的元素
    public ArrayList<Integer> list = new ArrayList<>();

    //求子集和
    public  int getSum(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }

    //回溯
    public  String getSubSet(int a[], int m, int step){
        while (step < a.length){
            list.add(a[step]);
            if (getSum(list) == m){
                return "perfect";
            }else {
                step++;
                getSubSet(a,m,step);
            }
            list.remove(list.size() - 1);
        }
        return "good";
    }
}

