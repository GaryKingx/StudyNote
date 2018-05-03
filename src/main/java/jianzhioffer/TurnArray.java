package jianzhioffer;

/**
 *旋转数组的最小数字
 * create by frank
 * on 2018/05/03
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
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
