package sort;

import java.util.Arrays;

/**
 * create by frank
 * on 2018/03/29
 * ������
 * ��������
 * ����˼·����׶���������� �ݼ�
 * �ӵײ������ڵ㣺index = a.length / 2 - 1 �õ��ڵ���������
 * left_node = index * 2 + 1 ;right_node = index * 2 +2
 * �ȽϽڵ�����ҽڵ�Ĵ�С�����ϴ�ֵ�û����ڵ�λ�ã��ݹ飬���ո��ڵ��ȡ�����ֵ
 * ���ڵ��β��Ҷ�ӽڵ㽻��
 * ����ƽ��ʱ�临�Ӷ�O��nlogn��
 **/
public class HeapSort {

    public static String sort(int[] a) {


        //�γɴ�׶�ṹ
        for (int index = a.length / 2 - 1; index >= 0; index--) {
            rootSort(a, index, a.length - 1);
        }
        //���ڵ��ƶ���β����ʣ�²��ּ����γɴ�׶�ṹ
        for (int i = a.length - 1; i > 0; i--) {
            int tmp = a[i];
            a[i] = a[0];
            a[0] = tmp;
            rootSort(a, 0, i);
        }
        return Arrays.toString(a);
    }

    public static void rootSort(int[] a, int index, int length) {
        //���ڵ�
        int tmp = a[index];
        //�����ڵ㣬ѡ����׶ͷ�����ڵ㲢�������αȽϸ��ڵ������ڵ��С
        for (int k = 2 * index + 1; k < length; k = k * 2 + 1) {
            //������ӽڵ�<���ӽڵ�
            if (k + 1 < length && a[k] < a[k + 1]) {
                //�������游�ڵ���ϴ���һ���ڵ�Ƚ�
                k++;
            }
            //������ڵ�С���ӽڵ�
            if (tmp < a[k]) {
                //���ڵ� = �ӽڵ�
                a[index] = a[k];
                //����ƫ��
                index = k;
            } else break;

        }
        //������ڵ����������ӽڵ��ظ�ֵ
        a[index] = tmp;
    }


    /**
     * ����Ѳ���
     * ˼·���ȰѴ��������ַ�������β����Ȼ���β���ڵ㿪ʼʵ�ִ�׶/С��׶�ṹ����
     *
     * @param a
     * @param insertNum
     * @return
     */
    public static String insert(int[] a, int insertNum) {

        a[a.length - 1] = insertNum;

        for (int i = a.length / 2 - 1; i >= 0; i--) {
            int tmp = a[i];
            for (int k = i * 2 + 1; k < a.length; k = k * 2 + 1) {
                if (k + 1 < a.length && a[k] < a[k + 1])
                    k++;
                if (tmp < a[k]) {
                    a[i] = a[k];
                    i = k;
                    a[i] = tmp;
                } else
                    break;
            }
        }
        return Arrays.toString(a);

    }

    /**
     * ����ѵ�ɾ������
     * ˼·��ɾ���ڵ���β���ڵ���н�����Ȼ���ٽ��д�׶/С��׶�ṹ������β��Ҷ�ӽڵ㲻���нṹ��������
     * @param a
     * @return
     */
    public static String delete(int[] a) {
        //ͷ�����ֵ������β������
        a[0] = a[a.length - 1];

        a[a.length - 1] = 0;
        for (int i = (a.length - 1) / 2 - 1; i >= 0; i--) {
            int tmp = a[i];
            for (int k = i * 2 + 1; k < a.length - 1; k = k * 2 + 1) {
                if (k < a.length - 1 && a[k] < a[k + 1])
                    k++;
                if (tmp < a[k]) {
                    a[i] = a[k];
                    i = k;
                    a[i] = tmp;
                } else break;
            }
        }
        return Arrays.toString(a);
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 9, 1, 4, 6, 7, 8, 0};
        int[] b = {90, 85, 70, 60, 80, 30, 20, 10, 50, 40};
        System.out.println(sort(a));
        System.out.println(HeapSort.insert(a, 10));
        System.out.println(HeapSort.delete(b));
        Integer x = 300;
        Integer y = 300;
        System.out.println(x==y);

    }
}
