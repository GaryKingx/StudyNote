package designpatterns.factorymethod;

/**
 * 简单工厂模式 一对多
 * create by frank
 * on 2018/05/02
 */
public class SimpleFactory {

    public Sender mailSender() {
        return new MailSender();
    }

    public Sender smsSender() {
        return new SmsSender();
    }
    //静态工厂模式
    //上述方法加上static关键字

}
