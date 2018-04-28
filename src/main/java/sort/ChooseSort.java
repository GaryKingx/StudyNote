package sort;

import java.util.Arrays;

/**
 * create by frank
 * on 2018/01/10
 * 时间复杂度O(n^2) 空间复杂度O(1)
 * 稳定度：不稳定
 * 原地排序
 */
public class ChooseSort {


    public static String sort(int[] a) {


        for (int i = 0; i < a.length; i++) {
            int k = i;//记录最小值索引
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            if (i != k) //条件判断，在找到更小值的情况下
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
