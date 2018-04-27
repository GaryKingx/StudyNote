package algorithms;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * create by frank
 * on 2018/02/05
 * 小B最近对电子表格产生了浓厚的兴趣，她觉得电子表格很神奇，功能远比她想象的强大。她正在研究的是单元格的坐标编号，她发现表格单元一般是按列编号的，
 * 第1列编号为A，第2列为B，以此类推，第26列为Z。之后是两位字符编号的，第27列编号为AA，第28列为AB，第52列编号为AZ。之后则是三位、四位、五位……字母编号的，规则类似。
 * 表格单元所在的行则是按数值从1开始编号的，表格单元名称则是其列编号和行编号的组合，
 * 如单元格BB22代表的单元格为54列中第22行的单元格。
 * 小B感兴趣的是，编号系统有时也可以采用RxCy的规则，
 * 其中x和y为数值，表示单元格位于第x行的有第y列。上述例子中的单元格采用这种编码体系时的名称为R22C54。
 */
public class NumberTransfer {
    public String transfer(String trans) {
        if (Pattern.matches("[A-Z]+[0-9]+", trans)) {
            String x = trans.replaceAll("[A-Z]", "");
            String y = trans.replaceAll("[0-9]", "");
            char[] a = y.toCharArray();
            int index = 0;
            for (int i = 0; i <a.length; i++) {
                int b = a.length - i - 1;
                int tmp = a[i] - 64;//A --> 1
                while (b > 0) {
                    tmp = tmp * 26;
                    b--;
                }
                index += tmp;
            }

            return "R" + x + "C" + index;
        } else {
            String x = trans.substring(trans.indexOf('R') + 1, trans.indexOf('C'));
            int y = Integer.parseInt(trans.substring(trans.indexOf('C') + 1, trans.length()));
            String index = "";

            while (y > 0) {
                int y1 = y % 26;
                if (y1 != 0) {
                    index = (char) (y1 + 'A' - 1) + "" + index;
                    y /= 26;
                } else {
                    //如果整除
                    index = 'Z' + index;
                    y = y / 26 - 1;//表示前方一位补满 剩余减一
                }
            }
            return index + x;
        }
    }

    public static void main(String args[]) {
        NumberTransfer main = new NumberTransfer();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String[] a = new String[x];
        for (int i = 0; i < x; i++) {
            a[i] = scanner.next();
        }
        for (String str : a)
            System.out.println(main.transfer(str));
    }

}


