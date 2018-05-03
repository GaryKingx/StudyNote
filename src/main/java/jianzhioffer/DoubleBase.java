package jianzhioffer;

/**
 * ��ֵ�������η�
 * create by frank
 * on 2018/05/03
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 * <p>
 * 5 ������  0101
 * 5 & 1    0001  2^0
 * 5 >> 1   0100
 * 5 & 1   0000  2^1 �����е��ӣ����ǽ��г˲���
 * 5 >> 1   0010
 * 5 & 1  0000  2^2 �����е���
 * 5 >> 1   0001
 * 5 & 1   0001  �Ƚ��кϲ��˲���(2^2)��Ȼ��ִ�г˲���
 * 5 >> 1   0000
 * Ϊ0 ����ѭ��
 */
public class DoubleBase {

        public double Power(double base, int exponent) {
            double rst = 1;
            double number = base;
            int dec = exponent;
            if (base == 0)
                return 0;
            if (dec == 0)
                return 1;
            if(dec < 0)
                dec = -exponent;
            while (dec != 0) {
                if ((dec & 1) == 1)
                    rst *= number;
                number *= number;
                dec >>= 1;
            }
            return (exponent >= 0)? rst:(1/rst);
        }

    public static void main(String[] args) {
        DoubleBase doubleBase = new DoubleBase();
        System.out.println(doubleBase.Power(-1, 2));
    }
}
