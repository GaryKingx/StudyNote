package algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 路灯
 * create by frank
 * on 2017/01/19
 * V先生有一天工作到很晚，回家的时候要穿过一条长l的笔直的街道，这条街道上有n个路灯。
 * 假设这条街起点为0，终点为l，第i个路灯坐标为ai。
 * 路灯发光能力以正数d来衡量，其中d表示路灯能够照亮的街道上的点与路灯的最远距离，所有路灯发光能力相同。
 * 为了让V先生看清回家的路，路灯必须照亮整条街道，又为了节省电力希望找到最小的d是多少？
 */
public class RoadLight {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int length = scanner.nextInt();
        double[] a = new double[count];

        for (int i = 0; i < count; i++)
            a[i] = scanner.nextInt();
        Arrays.sort(a);
        double end = a[0] > (length - a[count - 1]) ? a[0] : (length - a[count - 1]);
        double max =0;
        for (int j = 1; j < count; j++) {
            if ((a[j] - a[j - 1]) > max)
                max = a[j] - a[j - 1];
        }
        if(2 * end > max)
            max = 2 * end;
        System.out.printf("%.2f",max/2);
    }
}
