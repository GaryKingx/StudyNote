package jianzhioffer;

import java.util.ArrayList;

/**
 * create by frank
 * on 2018/05/09
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        //开始行数
        int startX = 0;
        //开始列数
        int startY = 0;
        //结束行数
        int endX = matrix.length - 1;
        //结束列数
        int endY = matrix[0].length - 1;
        int tmpX = 0;
        int tmpY = 0;
        while (startX <= endX && startY <= endY) {
            for (int a = startY; a <= endY; a++) {
                list.add(matrix[startX][a]);
                tmpY = a;
            }
            endY = tmpY;
            //当只有一行时的情况判断
            if (startX >= endX)
                endY = startY;
            startX++;
            for (int b = startX; b <= endX; b++) {
                list.add(matrix[b][endY]);
                tmpX = b;
            }
            endX = tmpX;
            //当只有一列时的情况判断
            if (startY >= endY)
                endX = startX;
            endY--;
            for (int c = endY; c >= startY; c--) {
                list.add(matrix[endX][c]);
                tmpY = c;
            }
            startY = tmpY;
            endX--;
            for (int d = endX; d >= startX; d--) {
                list.add(matrix[d][startY]);
                tmpX = d;
            }
            startX = tmpX;
            startY++;
        }
        return list;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4, 5}};
        PrintMatrix printMatrix = new PrintMatrix();
        System.out.println(printMatrix.printMatrix(a).toArray());
    }
}
