package sort;

import java.util.Arrays;

/**
 * create by frank
 * on 2018/01/10
 * 时间复杂度: O(N)~O(N^2) 空间复杂度: O(1)
 * 稳定度：稳定
 * 原地排序
 * 效率取决于输入元素的排列情况
 */
public class InsertSort {

    public static String sort(int []a){
        int j,insert;

        for(int i = 1;i < a.length ;i++){

            j = i-1;
            insert =a[i];

            while(j >= 0 && a[j] > insert){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] =insert;
        }
        return Arrays.toString(a);
    }
    public static void main(String []args){

        int a[] = {5, 1, 2, 8, 0, 7, 4};

        System.out.println(InsertSort.sort(a));
    }
}
