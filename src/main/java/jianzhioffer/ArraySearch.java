package jianzhioffer;

/**
 * ��ά�����еĲ���
 * create y frank
 * on 2018/04/28
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�����
 */
public class ArraySearch {
    /**
     * ���ֲ��ҷ�
     *
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int[][] array) {
        try {
            //��������
            int row = array.length;
            //��������
            int column = array[0].length;
            for (int i = 0; i < row; i++) {
                if (array[i][0] <= target && array[i][column - 1] >= target) {
                    int start = 0;
                    int end = column - 1;
                    while (start <= end) {
                        int mid = (start + end) / 2;
                        if (array[i][mid] > target)
                            end = mid - 1;
                        if (array[i][mid] < target)
                            start = mid + 1;
                        if (array[i][mid] == target)
                            return true;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    /**
     * �����㷨
     * ���½ǲ��ҷ����������Ҳ��ң�С�����ϲ���
     *
     * @param target
     * @param array
     * @return
     */
    public boolean Find2(int target, int[][] array) {
        //��������
        int row = array.length;
        //��������
        int column = array[0].length;
        int i = row - 1;
        int j = 0;
        while (i >= 0 && j < column) {
            if (array[i][j] == target)
                return true;
            if (array[i][j] > target) {
                i--;
                continue;
            }
            if (array[i][j] < target) {
                j++;
                continue;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        ArraySearch arraySearch = new ArraySearch();
        System.out.println(arraySearch.Find2(8, a));
    }
}
