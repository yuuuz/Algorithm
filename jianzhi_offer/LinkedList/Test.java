package jianzhi_offer.LinkedList;

import java.util.ArrayList;

/**
 * 2018/9/1 11:41
 */
public class Test {
    public static void main(String[] args) {
        PrintListFromTailToHead p = new PrintListFromTailToHead();
        DeleteDuplication d = new DeleteDuplication();
        ListNode l;
        ListNode listNode = new ListNode(1);
        l = listNode;
        l.next =  new ListNode(1);
        l = l.next;
        l.next =  new ListNode(1);
        l = l.next;
        l.next =  new ListNode(1);
//        l = l.next;
//        l.next =  new ListNode(4);
//        l = l.next;
//        l.next =  new ListNode(4);
//        l = l.next;
//        l.next =  new ListNode(5);

//        System.out.println(p.printListFromTailToHead(l));
//        System.out.println(d.deleteDuplication(l));
        listNode = d.deleteDuplication(listNode);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}
