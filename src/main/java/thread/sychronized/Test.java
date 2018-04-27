package thread.sychronized;
/**
 * create by frank
 * on 2018/04/20
 */
public class Test {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setMoney(3000);
        Bank bank = new Bank(customer);

        Company company = new Company(customer);
        for (int i = 0; i < 10; i++) {

            company.run();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            bank.run();

        }


    }
}
