package algorithms;

/**
 * �����㷨
 * create by frank
 * on 2018/01/18
 * �й�����
 * �У�С�����ǣ�
 *�������ܵļ��㣬С������һ֧��Ʊ����֪���������Ʊ�����쿪ʼ����Ʊ�������±仯��
 * ��һ�첻�䣬�Ժ���һ�죬��һ�죬�����죬��һ�죬�����죬��һ�졭�������ơ�
 *Ϊ������㣬����ÿ���Ǻ͵���Ϊ1����Ʊ��ʼ����ҲΪ1����������Ʊ�ĵ�n��ÿ�ɹ�Ʊֵ����Ǯ��
 *
 */
public class GodOfStock {

    public static int sort(int day) {
        //???
        int money;
        //????||?????
        int minusMoney = (int) (Math.sqrt(2 * day + 0.25) - 1.5);
        money = day - 2 * minusMoney;
        return money;
    }

    public static void main(String args[]) {

        System.out.println(GodOfStock.sort(6));
    }
}
