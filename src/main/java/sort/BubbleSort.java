package sort;

import java.util.Arrays;

/**
 * create by frank
 * on 2017/01/11
 * ʱ�临�Ӷ�O(n^2) �ռ临�Ӷ�O(1)
 */
public class BubbleSort {

    public static String sort(int[] a) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1; j++) {

                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }

            }

        }
        return Arrays.toString(a);
    }

    public static void main(String []args){

        int []a = {14,1,5,31,6,9,2,41,11,4};

        System.out.println(BubbleSort.sort(a));
    }
}
