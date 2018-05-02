package jianzhioffer.listnode;

import java.util.ArrayList;


/**
 * 打印节点类
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * create by frank
 * on 2018/05/02
 */
public class PrintListNode {
    /**
     * 定义全局变量进行递归遍历
     */
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }

    /**
     * 局部变量，先添加，再翻转
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        int size = list.size();
        for(int i = 0;i< size/2;i++){
            int tmp = list.get(i);
            list.set(i,list.get(size - i - 1));
            list.set(size - i -1,tmp);
        }
        return list;
    }
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        PrintListNode printListNode = new PrintListNode();
        System.out.println(printListNode.printListFromTailToHead(listNode));
    }
}
