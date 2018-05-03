package jianzhioffer;

import java.util.Stack;

/**
 * ����ջʵ�ֶ���
 * create by frank
 * on 2018/05/03
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 */
public class StackQueue {
    //�洢ջ
    Stack<Integer> stack1 = new Stack<Integer>();
    //��ʱ�洢ջ
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int element = 0;
        //�洢ջ���ݱ�������ʱ�洢ջ
        while (!stack1.empty())
            stack2.push(stack1.pop());
        //��ջ
        if (!stack2.empty())
            element = stack2.pop();
        //��ʱջ�������ݵ��洢ջ
        while (!stack2.empty())
            stack1.push(stack2.pop());

        return element;
    }

    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();
        stackQueue.push(1);
        stackQueue.push(2);
        stackQueue.push(3);
        stackQueue.pop();
        stackQueue.pop();
        stackQueue.push(4);

        System.out.println(stackQueue.stack1);
    }
}
