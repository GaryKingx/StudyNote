package algorithms;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * create by frank
 * on 2018/02/05
 * СB����Ե��ӱ�������Ũ�����Ȥ�������õ��ӱ������棬����Զ���������ǿ���������о����ǵ�Ԫ��������ţ������ֱ��Ԫһ���ǰ��б�ŵģ�
 * ��1�б��ΪA����2��ΪB���Դ����ƣ���26��ΪZ��֮������λ�ַ���ŵģ���27�б��ΪAA����28��ΪAB����52�б��ΪAZ��֮��������λ����λ����λ������ĸ��ŵģ��������ơ�
 * ���Ԫ���ڵ������ǰ���ֵ��1��ʼ��ŵģ����Ԫ�����������б�ź��б�ŵ���ϣ�
 * �絥Ԫ��BB22����ĵ�Ԫ��Ϊ54���е�22�еĵ�Ԫ��
 * СB����Ȥ���ǣ����ϵͳ��ʱҲ���Բ���RxCy�Ĺ���
 * ����x��yΪ��ֵ����ʾ��Ԫ��λ�ڵ�x�е��е�y�С����������еĵ�Ԫ��������ֱ�����ϵʱ������ΪR22C54��
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
                    //�������
                    index = 'Z' + index;
                    y = y / 26 - 1;//��ʾǰ��һλ���� ʣ���һ
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


