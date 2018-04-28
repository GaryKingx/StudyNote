package sort;

import java.util.Arrays;

/**
 * create by frank
 * on 2018/03/29
 * 堆排序
 * 基本思路：大顶锥：先序排列 递减
 * 从底部遍历节点：index = a.length / 2 - 1 得到节点所在索引
 * left_node = index * 2 + 1 ;right_node = index * 2 +2
 * 比较节点和左右节点的大小，将较大值置换到节点位置，递归，最终根节点获取到最大值
 * 父节点和尾部叶子节点交换
 **/
public class HeapSort {

    public static String sort(int[] a) {


        //形成大顶锥结构
        for (int index = a.length / 2 - 1; index >= 0; index--) {
            rootSort(a, index, a.length - 1);
        }
        //根节点移动到尾部，剩下部分继续形成大顶锥结构
        for (int i = a.length - 1; i > 0; i--) {
            int tmp = a[i];
            a[i] = a[0];
            a[0] = tmp;
            rootSort(a, 0, i);
        }
        return Arrays.toString(a);
    }

    public static void rootSort(int[] a, int index, int length) {
        //父节点
        int tmp = a[index];
        //遍历节点，选出大顶锥头部最大节点并往下依次比较父节点和子孙节点大小
        for (int k = 2 * index + 1; k < length; k = k * 2 + 1) {
            //如果左子节点<右子节点
            if (k + 1 < length && a[k] < a[k + 1]) {
                //便于下面父节点跟较大那一个节点比较
                k++;
            }
            //如果父节点小于子节点
            if (tmp < a[k]) {
                //父节点 = 子节点
                a[index] = a[k];
                //索引偏移
                index = k;
            } else break;

        }
        //如果父节点更换，完成子节点重赋值
        a[index] = tmp;
    }


    public static void main(String[] args) {
        int[] a = {3, 5, 9, 1, 4, 6, 7, 8};
        System.out.println(HeapSort.sort(a));
    }
}

