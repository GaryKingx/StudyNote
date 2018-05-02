package sort;

import java.util.Arrays;

/**
 * create by frank
 * on 2017/01/11
 * ʱ�临�Ӷ� O(NlogN) �ռ临�Ӷ�O(lgN)
 * �ȶ��ԣ����ȶ�
 * ԭ������
 * ����Ч���ɸ����ṩ��֤
 */
public class QuickSort {


    public static String sort(int[] a, int start, int end) {

        int low = start;
        int high = end;
        int key = a[low];

        while (low < high) {

            //���ұ����ֱ�ѡ��ֵ��/���ڵ�ʱ�򣬲����н��� high--
            while (low < high && a[high] >= key)
                high--;
            //�෴���������λ�ã�keyΪѡ��ֵ���������ж�Χ���������У��������ǲ����г־����õģ�
            a[low] = a[high];
            a[high] = key;

            //��������ֱ�ѡ��ֵС/���ڵ�ʱ�򣬲����н��� low++
            while (low < high && a[low] <= key)
                low++;
            //�෴�������������ͬԭ��
            a[high] = a[low];
            a[low] = key;
        }

        if(low > start)
            //�ݹ飬ԭ����ǽ�ѡ��ֵ�󲿷ֽ�����ͬ����
            sort(a,start,low-1);
        if(high < end)
            //ͬ�ϣ��Ҳ���
            sort(a,high+1,end);

        return Arrays.toString(a);

    }


    public static void main(String[] args) {
        int[] a = {1, 2, 66, 21, 5, 10, 88, 111, 35};

        System.out.println(QuickSort.sort(a, 0, a.length - 1));

    }
}
