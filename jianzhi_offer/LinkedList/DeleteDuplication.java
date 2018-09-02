package jianzhi_offer.LinkedList;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * 2018/8/21 14:47
 */

public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode l = new ListNode(0);
        l.next = pHead;
        ListNode left = l;
        ListNode right = pHead;
        //为什么 right != null ? 因为right如果为空，则没有right.next
        while (right != null && right.next != null){
            if (right.val == right.next.val){
                int val = right.val;
                while (right != null && right.val == val){
                    right = right.next;
                }
                left.next = right;
            }else {
                left = left.next;
                right = right.next;
            }
        }
        return l.next;
    }
}
