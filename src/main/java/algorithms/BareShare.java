package algorithms;

import java.util.Scanner;

/**
 * ��ƻ��
 * create by frank
 * on 2018/01/19
 * ��԰���ж�ƻ����N��1��N��9��ֻ�����֡���һֻ�ܰ����ƻ��ƽ����ΪN�ݣ�����һ�������Ѷ��һ�����ˣ�������һ�ݡ�
 * �ڶ�ֻ�ܰ�ʣ�µ�ƻ����ƽ���ֳ�N�ݣ��ֶ���һ������ͬ���Ѷ��һ�����ˣ�������һ�ݣ�
 * ����������ֱ����Nֻ�ܶ�����ô���ģ��ʹ�԰��ԭ�������ж��ٸ�ƻ����
 */
public class BareShare {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 1;
        for (int i = 0; i < num; i++) {
            sum = sum * num;
        }
        System.out.println(sum - num +1);
    }

}
