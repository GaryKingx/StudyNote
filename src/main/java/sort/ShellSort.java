package sort;

import java.util.Arrays;

/**
 * create by frank
 * on 2017/01/17
 * 时间复杂度 ：O(NlogN) ~ O(N^6/5) 空间复杂度O(1)
 * 稳定性：不稳定
 * 原地排序
 */
public class ShellSort {

    public static String sort(int[] a) {
        int k = 0;
        int t = 0;
        //一层循环 缩小间隔
        for (int i = a.length / 2; i > 0; i /= 2) {
            //二层循环 间隔内容遍历
            for (int j = i; j < a.length; j++) {
                t = a[j];
                //三层循环 两两比较大小 进行位置调换
                for (k = j - i; k >= 0; k -= i) {

                    //直接插入法排序 当新插入的数字比已经排好的最后一个数字小的时候
                    if (t < a[k]) {
                        //原先最后一位数值移入新插入位置 最后一位变为移动位置不断与前面数字比较
                        a[k + i] = a[k];
                    } else {
                        //当新插入值小于等于前方值时 即找到合适位置  （这里k执行了 k-i）
                        break;
                    }
                }
                //break 出来后 k+i 即为移动位置 即插入位置
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
