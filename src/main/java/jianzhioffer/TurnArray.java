package jianzhioffer;

/**
 *��ת�������С����
 * create by frank
 * on 2018/05/03
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
public class TurnArray {

    public int minNumberInRotateArray(int [] array) {
        if(array == null || array.length ==0)
            return 0;
        int min = array[0];
        for(int i = 1;i<array.length;i++){
            if(min > array[i])
                min = array[i];
        }
        return min;
    }
}
