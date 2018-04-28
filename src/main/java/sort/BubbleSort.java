package sort;

import java.util.Arrays;

/**
 * create by frank
 * on 2018/01/11
 * 时间复杂度O(n^2) 空间复杂度O(1)
 * 稳定性：稳定
 * 原地排序
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
