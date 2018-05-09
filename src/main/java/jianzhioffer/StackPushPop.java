package jianzhioffer;

import java.util.Stack;

/**
 * create by frank
 * on 2018/05/09
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class StackPushPop {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (popA == null || pushA == null)
            return false;
        Stack<Integer> stack = new Stack<>();
        int x = 0;
        int index = popA.length - 1;
        for (int i = 0; i <= index; i++) {
            stack.push(pushA[i]);
            if (popA[x] == pushA[i]) {
                stack.pop();
                x++;
            }
        }
        for (; x <= index; x++) {
            int tmp = stack.pop();
            stack.push(tmp);
            if (popA[x] == tmp)
                stack.pop();
            else break;
        }
        return stack.empty() == true ? true : false;
    }

    public static void main(String[] args) {
        int push[] = {1};
        int pop[] = {2};

        StackPushPop stackPushPop = new StackPushPop();
        System.out.println(stackPushPop.IsPopOrder(push, pop));
    }
}
