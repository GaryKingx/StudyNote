package jianzhioffer;

/**
 * 数值的整数次方
 * create by frank
 * on 2018/05/03
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * <p>
 * 5 二进制  0101
 * 5 & 1    0001  2^0
 * 5 >> 1   0100
 * 5 & 1   0000  2^1 不进行叠加，但是进行乘操作
 * 5 >> 1   0010
 * 5 & 1  0000  2^2 不进行叠加
 * 5 >> 1   0001
 * 5 & 1   0001  先进行合并乘操作(2^2)，然后执行乘操作
 * 5 >> 1   0000
 * 为0 结束循环
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
