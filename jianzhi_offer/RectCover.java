package jianzhi_offer;

/**
 * 2018/9/12 15:34
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class RectCover {
    public int rectCover(int target) {
        if (target == 0){
            return 0;
        }else if (target == 1){
            return 1;
        }else if (target == 2){
            return 2;
        }else {
            return rectCover(target - 1) + rectCover(target - 2);
        }
    }
}
