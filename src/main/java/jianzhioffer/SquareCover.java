package jianzhioffer;

/**
 * ���θ���
 * create by frank
 * on 2018/05/03
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * <p>
 * n= 1ʱ
 * <p>
 * f(1) = 1;
 * <p>
 * n = 2 ʱ
 * <p>
 * f(2) = 2;    حح ��=
 * <p>
 * n = 3 ʱ
 * <p>
 * f(3) = 3;  ححح �� =ح��ح=  ��f(2)�����Ͻ������
 * <p>
 * n = 4 ʱ
 * <p>
 * f(4) = 5; حححح��ح=ح��=حح��حح=��==
 * <p>
 * �� f(n) = f(n-1) + f (n - 2) (n > 2)
 * 쳲���������
 */
public class SquareCover {

    public int RectCover(int target) {
        if (target < 1)
            return 0;
        else if (target == 1 || target == 2)
            return target;
        else return RectCover(target - 1) + RectCover(target - 2);
    }

    public static void main(String[] args) {
        SquareCover squareCover = new SquareCover();
        System.out.println(squareCover.RectCover(4));
    }
}
