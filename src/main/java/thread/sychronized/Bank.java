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
        //������
        synchronized (customer){
            //��ȡ��������ִ��Ȩ
            if(customer.getMoney() < 1000){
                customer.add(2000);
                System.out.println("������Ϣ����,���Ϊ:"+customer.getMoney());
                //֪ͨCompany�����ȴ�
                customer.notifyAll();
            }
        }



    }
}
