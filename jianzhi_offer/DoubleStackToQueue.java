package jianzhi_offer;
import java.util.*;
/**
 * 2018/7/18 19:45
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class DoubleStackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() throws Exception {
        if (stack2.empty() && stack1.empty()){
            throw new EmptyStackException();
        }
        if (stack2.empty()){
            while (!stack1.empty()) {
                int n = stack1.pop();
                stack2.push(n);
            }
        }
        return stack2.pop();
    }
}
