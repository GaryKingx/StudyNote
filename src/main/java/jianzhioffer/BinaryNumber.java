package jianzhioffer;

/**
 * 二进制中1的个数
 * create by frank
 * on 2018/05/03
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class BinaryNumber {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        BinaryNumber binaryNumber = new BinaryNumber();
        System.out.println(binaryNumber.NumberOf1(-7));
    }
}
