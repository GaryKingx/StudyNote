package jianzhioffer;

import java.util.Iterator;
import java.util.Stack;

/**
 * create by frank
 * on 2018/05/09
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class MinStack {
    private Stack<Integer> stack = new Stack<>();


    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        if (stack.empty())
            return 0;
        int top = stack.pop();
        stack.push(top);
        return top;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<>();
        while (!this.stack.empty()){
            int next =top();
            if(min > next)
                min = next;
            stack.push(next);
            pop();
        }

        while (!stack.empty()){
            push(stack.pop());
        }
        return min;
    }

    public int min2() {
        int min = Integer.MAX_VALUE;
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            int x = iterator.next();
            if(min > x)
                min = x;
        }
        return min;
    }

    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(123);
        minStack.push(451);
        minStack.push(11);
        minStack.push(154);
        minStack.push(78);
        minStack.push(5);
        System.out.println(minStack.min());
    }
}
