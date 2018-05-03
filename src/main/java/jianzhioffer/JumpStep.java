package jianzhioffer;

/**
 * 跳台阶
 * create by frank
 * on 2018/05/03
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 原理为斐波那契数列
 */
public class JumpStep {
    /**
     * 递归实现
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
     *迭代实现
     * @param target
     * @return
     */
    public int JumpFloor2(int target) {
        //总跳法
        int sum = 0;
        //上次跳之前的跳法
        int one = 2;
        //上上次跳之前的跳法
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
