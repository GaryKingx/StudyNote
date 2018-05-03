package jianzhioffer;

/**
 * 矩形覆盖
 * create by frank
 * on 2018/05/03
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * <p>
 * n= 1时
 * <p>
 * f(1) = 1;
 * <p>
 * n = 2 时
 * <p>
 * f(2) = 2;    丨丨 、=
 * <p>
 * n = 3 时
 * <p>
 * f(3) = 3;  丨丨丨 、 =丨、丨=  在f(2)基础上进行添加
 * <p>
 * n = 4 时
 * <p>
 * f(4) = 5; 丨丨丨丨、丨=丨、=丨丨、丨丨=、==
 * <p>
 * 则 f(n) = f(n-1) + f (n - 2) (n > 2)
 * 斐波那契数列
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
