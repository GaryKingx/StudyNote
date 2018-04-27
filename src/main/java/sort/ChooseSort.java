package sort;

import java.util.Arrays;

/**
 * create by frank
 * on 2018/01/10
 * ʱ�临�Ӷ�O(n^2) �ռ临�Ӷ�O(1)
 */
public class ChooseSort {


    public static String sort(int[] a) {


        for (int i = 0; i < a.length; i++) {
            int k = i;//��¼��Сֵ����
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            if (i != k) //�����жϣ����ҵ���Сֵ�������
            {
                int tmp = a[i];
                a[i] = a[k];
                a[k] = tmp;
            }
        }
        return Arrays.toString(a);
    }

    public static void main(String args[]) {
        int a[] = {5, 1, 2, 8, 0, 7, 4};

        System.out.println(sort(a));
    }

}
