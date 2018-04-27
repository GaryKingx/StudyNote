package algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ·��
 * create by frank
 * on 2017/01/19
 * V������һ�칤���������ؼҵ�ʱ��Ҫ����һ����l�ı�ֱ�Ľֵ��������ֵ�����n��·�ơ�
 * �������������Ϊ0���յ�Ϊl����i��·������Ϊai��
 * ·�Ʒ�������������d������������d��ʾ·���ܹ������Ľֵ��ϵĵ���·�Ƶ���Զ���룬����·�Ʒ���������ͬ��
 * Ϊ����V��������ؼҵ�·��·�Ʊ������������ֵ�����Ϊ�˽�ʡ����ϣ���ҵ���С��d�Ƕ��٣�
 */
public class RoadLight {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int length = scanner.nextInt();
        double[] a = new double[count];

        for (int i = 0; i < count; i++)
            a[i] = scanner.nextInt();
        Arrays.sort(a);
        double end = a[0] > (length - a[count - 1]) ? a[0] : (length - a[count - 1]);
        double max =0;
        for (int j = 1; j < count; j++) {
            if ((a[j] - a[j - 1]) > max)
                max = a[j] - a[j - 1];
        }
        if(2 * end > max)
            max = 2 * end;
        System.out.printf("%.2f",max/2);
    }
}
