package jianzhioffer;

import java.util.ArrayList;

/**
 * create by frank
 * on 2018/05/09
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬����������¾��� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        //��ʼ����
        int startX = 0;
        //��ʼ����
        int startY = 0;
        //��������
        int endX = matrix.length - 1;
        //��������
        int endY = matrix[0].length - 1;
        int tmpX = 0;
        int tmpY = 0;
        while (startX <= endX && startY <= endY) {
            for (int a = startY; a <= endY; a++) {
                list.add(matrix[startX][a]);
                tmpY = a;
            }
            endY = tmpY;
            //��ֻ��һ��ʱ������ж�
            if (startX >= endX)
                endY = startY;
            startX++;
            for (int b = startX; b <= endX; b++) {
                list.add(matrix[b][endY]);
                tmpX = b;
            }
            endX = tmpX;
            //��ֻ��һ��ʱ������ж�
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
