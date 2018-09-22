package jianzhi_offer;

/**
 * 2018/9/6 12:52
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 */
public class JumpFloor {
    /**
     * 有两种跳法，最后一次跳的是1，则之前的跳法为f(n-1）；
     *             最后一次跳的是2，则之前的跳法为f(n-2)
     * @param target
     * @return
     */
    public int jumpFloor(int target) {
        if (target == 1){
            return 1;
        }else if (target == 2){
            return 2;
        }else {
            return jumpFloor(target - 1) + jumpFloor(target - 2);
        }
    }
}
