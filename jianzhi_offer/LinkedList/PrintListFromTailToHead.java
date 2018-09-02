package jianzhi_offer.LinkedList;

//输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。

import java.util.ArrayList;
import java.util.Stack;

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
