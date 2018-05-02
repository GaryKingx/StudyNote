package designpatterns.builder;


import java.util.ArrayList;
import java.util.List;

/**
 * ������ģʽ
 * create by frank
 * on 2018/05/02
 * ��������
 */
public class Builder {

    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++)
            list.add(new MailSender());
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++)
            list.add(new SmsSender());
    }
}
