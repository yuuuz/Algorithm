package jianzhi_offer;

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

/**
 * 2018/8/5 20:04
 */
public class PrintListFromTailToHead {
    ArrayList<Integer> arrayList = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            stack.push(listNode.val);
            while (listNode.next != null) {
                listNode = listNode.next;
                int s = listNode.val;
                stack.push(s);
            }
        }
        while (!stack.empty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

//递归版本
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        if (listNode != null) {
//            this.printListFromTailToHead(listNode.next);
//            arrayList.add(listNode.val);
//        }
//        return arrayList;
//    }
}
