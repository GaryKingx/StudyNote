package thread.sychronized;

/**
 * create by frank
 * on 2018/04/20
 */
public class Customer{

    private int money;

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public synchronized void add(int money) {
        this.money += money;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized int out(int money) {
        int rst = 1;
        if (this.money >= money){
            this.money -= money;
        }else rst = 2;

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return rst;
    }


}
