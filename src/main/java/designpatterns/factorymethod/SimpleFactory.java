package designpatterns.factorymethod;

/**
 * �򵥹���ģʽ һ�Զ�
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
    //��̬����ģʽ
    //������������static�ؼ���

}
