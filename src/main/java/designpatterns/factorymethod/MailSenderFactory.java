package designpatterns.factorymethod;

/**
 * 抽象工厂模式
 * create by frank
 * on 2018/05/02
 */
public class MailSenderFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
