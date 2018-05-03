package jianzhioffer;

/**
 * ��̨��
 * create by frank
 * on 2018/05/03
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
 * ԭ��Ϊ쳲���������
 */
public class JumpStep {
    /**
     * �ݹ�ʵ��
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        if (target < 1)
            return 0;
        else if (target == 1 || target == 2)
            return target;
        else
            return JumpFloor(target - 1) + JumpFloor(target - 2);
    }

    /**
     *����ʵ��
     * @param target
     * @return
     */
    public int JumpFloor2(int target) {
        //������
        int sum = 0;
        //�ϴ���֮ǰ������
        int one = 2;
        //���ϴ���֮ǰ������
        int two = 1;
        if (target < 1)
            return 0;
        else if (target == 1 || target == 2)
            return target;
        else {
            for (int i = 3; i <= target; i++){
                sum = one + two;
                two = one;
                one = sum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        JumpStep jumpStep = new JumpStep();
        System.out.println(jumpStep.JumpFloor2(8));
    }
}
