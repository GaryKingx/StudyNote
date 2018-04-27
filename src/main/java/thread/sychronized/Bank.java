package thread.sychronized;
/**
 * create by frank
 * on 2018/04/20
 */
public class Bank implements Runnable{
    private Customer customer;
    private String name;
    public Bank(Customer customer){
        this.customer = customer;
    }

    public String getName() {
        return name;
    }


    @Override
    public void run() {
        //对象锁
        synchronized (customer){
            //获取对象锁和执行权
            if(customer.getMoney() < 1000){
                customer.add(2000);
                System.out.println("银行利息到账,余额为:"+customer.getMoney());
                //通知Company结束等待
                customer.notifyAll();
            }
        }



    }
}
