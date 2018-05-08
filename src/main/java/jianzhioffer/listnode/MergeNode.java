package jianzhioffer.listnode;

/**
 * create by frank
 * on 2018/05/08
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeNode {

    /**
     * 递归版本
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }

    /**
     * 非递归
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge2(ListNode list1, ListNode list2) {
        ListNode currentNode = list1.val > list2.val ? list2 : list1;
        ListNode newNode = null;
        if (currentNode == list1) {
            newNode = list1;
            list1 = list1.next;

        } else {
            newNode = list2;
            list2 = list2.next;
        }

        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currentNode.next = list1;
                currentNode = currentNode.next;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                currentNode = currentNode.next;
                list2 = list2.next;
            }
        }
        while (list2 != null) {
            currentNode.next = list2;
            currentNode = currentNode.next;
            list2 = list2.next;
        }
        while (list1 != null) {
            currentNode.next = list1;
            currentNode = currentNode.next;
            list1 = list1.next;
        }
        return newNode;
    }

    public static void main(String[] args) {
        MergeNode mergeNode = new MergeNode();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(8);
        ListNode listNode4 = new ListNode(11);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(7);
        ListNode listNode7 = new ListNode(15);
        ListNode listNode8 = new ListNode(20);
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        ListNode merge = mergeNode.Merge2(listNode1, listNode5);
        while (merge != null) {
            System.out.println(merge.val);
            merge = merge.next;
        }
    }
}
