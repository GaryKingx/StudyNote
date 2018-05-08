package jianzhioffer.listnode;

/**
 * create by frank
 * on 2018/05/07
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindTailNode {

    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode leftNode = head;
        ListNode rightNode = head;

        if (head == null)
            return null;
        for (int i = 1; i <= k; i++) {
            if(rightNode.next == null && i != k)
                return null;
            rightNode = rightNode.next;
        }
        while (rightNode != null){
            leftNode = leftNode.next;
            rightNode = rightNode.next;
        }
        return leftNode;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        FindTailNode findTailNode = new FindTailNode();

        System.out.println(findTailNode.FindKthToTail(listNode1,5));
    }
}
