package jianzhioffer;

/**
 * ��������1�ĸ���
 * create by frank
 * on 2018/05/03
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
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
