package jianzhioffer;

/**
 * 斐波那契数列
 * create by frank
 * on 2018/05/03
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 */
public class FibonacciSequence {

    public int Fibonacci(int n) {
        int pre1 = 1;
        int pre2 = 1;
        int rst = 1;
        if (n == 1 || n == 2)
            return rst;
        else if (n <= 0)
            return 0;
        for (int i = 3; i <= n; i++) {
            rst = pre1 + pre2;
            pre2 = pre1;
            pre1 = rst;
            //也可使用递归，耗时
        }
        return rst;
    }

    public static void main(String[] args) {

        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        System.out.println(fibonacciSequence.Fibonacci(5));
    }
}
