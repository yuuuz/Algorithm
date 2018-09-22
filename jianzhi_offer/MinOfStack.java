package jianzhi_offer;

import java.util.Stack;

/**
 * 2018/8/11 0:27
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 思路：栈1用来正常的pop和push，栈2顶存放最小元素（栈底 > 栈顶)
 */
public class MinOfStack {
    private int mint;
    private Stack<Integer> stack1= new Stack<>();
    private Stack<Integer> stack2= new Stack<>();

    /**
     * @param node
     * 把node压入堆栈1中
     * 如果栈2为空，则将node压入堆栈2中,并将node的值存放在mint中；
     * 如果栈2不为空并且要压入的node比mint小，则更新mint中的值，并将node压入堆栈2中,使栈2顶为最小元素
     */
    public void push(int node) {
        stack1.push(node);
        if (stack2.empty()){
            stack2.push(node);
            mint = node;
        }else if (node < mint){
            mint = node;
            stack2.push(node);
        }
    }

    /**
     * 栈1弹出元素
     * 如果栈1中弹出的元素与栈2顶元素相等，则栈2也要弹出
     */
    public void pop() {
        int temp = stack1.pop();
        int min = stack2.pop();
        if (temp != min){
            stack2.push(min);
        }
    }

    /**
     * @return 栈顶元素
     */
    public int top() {
        int num = stack1.pop();
        stack1.push(num);
        return num;
    }

    /**
     *
     * @return 栈中最小元素值
     */
    public int min() {
        int min = stack2.pop();
        stack2.push(min);
        return min;
    }
}
