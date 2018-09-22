package jianzhi_offer.LinkedList;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * 2018/8/21 14:47
 *
 * 思路：如果链表只有一个结点或者链表为空，则直接返回该链表头结点
 *       在该链表前加一个结点l，解决头结点就是重复值的问题，使结点left指向这个结点l，结点right指向原链表头结点
 *       (left指向已经检索后的不重复结点的最后一个结点，right指向下一个待确定的结点)
 *       当right有值并且right.next有值时,
 *       --> 如果right和right.next相等，right向后移动直到不是重复结点为止，left.next = right(中间结点被跳过）；
 *       --> 否则说明不是重复结点，left和right均移向下一个结点
 *       返回l.next。
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
        //为什么要有 right != null ? 因为right如果为空，则没有right.next
        while (right != null && right.next != null){
            if (right.val == right.next.val){
                int val = right.val;
                while (right != null && right.val == val){
                    right = right.next;
                }
                left.next = right;
            }else {
                left = left.next;
                //或者 left = right;
                right = right.next;
            }
        }
        return l.next;
    }
}
