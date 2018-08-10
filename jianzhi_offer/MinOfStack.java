package jianzhi_offer;

import java.util.Stack;

/**
 * 2018/8/11 0:27
 */
public class MinOfStack {
    private int mint;
    private Stack<Integer> stack1= new Stack<>();
    private Stack<Integer> stack2= new Stack<>();

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

    public void pop() {
        int temp = stack1.pop();
        int min = stack2.pop();
        if (temp != min){
            stack2.push(min);
        }
    }

    public int top() {
        int num = stack1.pop();
        stack1.push(num);
        return num;
    }

    public int min() {
        int min = stack2.pop();
        stack2.push(min);
        return min;
    }
}
