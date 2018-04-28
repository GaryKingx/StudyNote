package algorithms;

/**
 * 股神算法
 * create by frank
 * on 2018/01/18
 * 有股神吗？
 * 有，小赛就是！
 *经过严密的计算，小赛买了一支股票，他知道从他买股票的那天开始，股票会有以下变化：
 * 第一天不变，以后涨一天，跌一天，涨两天，跌一天，涨三天，跌一天…依此类推。
 *为方便计算，假设每次涨和跌皆为1，股票初始单价也为1，请计算买股票的第n天每股股票值多少钱？
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
