package jianzhioffer;

import java.util.Stack;

/**
 * 两个栈实现队列
 * create by frank
 * on 2018/05/03
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class StackQueue {
    //存储栈
    Stack<Integer> stack1 = new Stack<Integer>();
    //临时存储栈
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int element = 0;
        //存储栈数据遍历到临时存储栈
        while (!stack1.empty())
            stack2.push(stack1.pop());
        //出栈
        if (!stack2.empty())
            element = stack2.pop();
        //临时栈遍历数据到存储栈
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
