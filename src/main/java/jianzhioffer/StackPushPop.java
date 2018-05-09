package jianzhioffer;

import java.util.Stack;

/**
 * create by frank
 * on 2018/05/09
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ�
 * ��������1,2,3,4,5��ĳջ��ѹ��˳������4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
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
