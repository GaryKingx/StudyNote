package thread.sychronized;
/**
 * create by frank
 * on 2018/04/20
 */
public class Company implements Runnable {
    private String name;
    private Customer customer;

    public Company(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        synchronized (customer){

            if (customer.getMoney() < 1000) {
                try {
                    //进入等待 释放对象锁 释放执行权
                    customer.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            customer.out(1000);
            System.out.println("公司帐号发放工资,余额为:" + customer.getMoney());
        }
        }

    }

