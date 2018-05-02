package designpatterns.factorymethod;

/**
 * ���󹤳�ģʽ
 * create by frank
 * on 2018/05/02
 */
public class MailSenderFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
