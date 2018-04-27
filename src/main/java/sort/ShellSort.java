package sort;

import java.util.Arrays;

/**
 * create by frank
 * on 2017/01/17
 * ʱ�临�Ӷ� ��O(NlogN) ~ O(N^6/5) �ռ临�Ӷ�O(1)
 * �ȶ��ԣ����ȶ�
 * ԭ������
 */
public class ShellSort {

    public static String sort(int[] a) {
        int k = 0;
        int t = 0;
        //һ��ѭ�� ��С���
        for (int i = a.length / 2; i > 0; i /= 2) {
            //����ѭ�� ������ݱ���
            for (int j = i; j < a.length; j++) {
                t = a[j];
                //����ѭ�� �����Ƚϴ�С ����λ�õ���
                for (k = j - i; k >= 0; k -= i) {

                    //ֱ�Ӳ��뷨���� ���²�������ֱ��Ѿ��źõ����һ������С��ʱ��
                    if (t < a[k]) {
                        //ԭ�����һλ��ֵ�����²���λ�� ���һλ��Ϊ�ƶ�λ�ò�����ǰ�����ֱȽ�
                        a[k + i] = a[k];
                    } else {
                        //���²���ֵС�ڵ���ǰ��ֵʱ ���ҵ�����λ��  ������kִ���� k-i��
                        break;
                    }
                }
                //break ������ k+i ��Ϊ�ƶ�λ�� ������λ��
                a[k + i] = t;

            }
        }
        return Arrays.toString(a);
    }

    public static void main(String args[]) {

        int[] a = {11, 26, 66, 21, 5, 10, 88, 1, 35};

        System.out.println(ShellSort.sort(a));

    }
}
