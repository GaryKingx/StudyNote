package jianzhioffer;

/**
 * 쳲���������
 * create by frank
 * on 2018/05/03
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
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
            //Ҳ��ʹ�õݹ飬��ʱ
        }
        return rst;
    }

    public static void main(String[] args) {

        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        System.out.println(fibonacciSequence.Fibonacci(5));
    }
}
