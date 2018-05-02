package sort;

import java.util.Arrays;

/**
 * create by frank
 * on 2017/01/11
 * 时间复杂度 O(NlogN) 空间复杂度O(lgN)
 * 稳定性：不稳定
 * 原地排序
 * 运行效率由概率提供保证
 */
public class QuickSort {


    public static String sort(int[] a, int start, int end) {

        int low = start;
        int high = end;
        int key = a[low];

        while (low < high) {

            //当右边数字比选中值大/等于的时候，不进行交换 high--
            while (low < high && a[high] >= key)
                high--;
            //相反情况，交换位置（key为选中值，本次排列都围绕着他进行，所以他是不动切持久有用的）
            a[low] = a[high];
            a[high] = key;

            //当左边数字比选中值小/等于的时候，不进行交换 low++
            while (low < high && a[low] <= key)
                low++;
            //相反情况，跟上述相同原理
            a[high] = a[low];
            a[low] = key;
        }

        if(low > start)
            //递归，原理就是将选中值左部分进行相同操作
            sort(a,start,low-1);
        if(high < end)
            //同上，右部分
            sort(a,high+1,end);

        return Arrays.toString(a);

    }


    public static void main(String[] args) {
        int[] a = {1, 2, 66, 21, 5, 10, 88, 111, 35};

        System.out.println(QuickSort.sort(a, 0, a.length - 1));

    }
}
