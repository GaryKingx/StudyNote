package jianzhioffer.listnode;


/**
 * create by frank
 * on 2018/05/07
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class TurnList {

    /**
     * 递归实现
     *
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {

        if (head == null || head.next == null)
            return head;
        ListNode node = ReverseList(head.next);
        //指向反转
        head.next.next = head;
        //清除原始指针
        head.next = null;
        return node;
    }

    /**
     * 非递归
     * @param head
     * @return
     */
    public ListNode ReverseList2(ListNode head) {

        ListNode newNode = null;
        ListNode preNode = null;
        if (head == null)
            return null;
        while (head != null){
            ListNode  nextNode = head.next;
            if(nextNode == null)
                newNode = head;
            head.next = preNode;
            preNode = head;
            head = nextNode;
        }
        return newNode;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        TurnList turnList = new TurnList();
        ListNode listNode = turnList.ReverseList2(listNode1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}
