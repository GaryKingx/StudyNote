package singleton;

/**
 * ����ģʽ
 * ������оʹ�����̬���� �����̰߳�ȫ
 * create by frank
 * on 2018/04/27
 */
public class HungryManModel {
    //�����֣� 1
    private static final HungryManModel INSTANCE = new HungryManModel();
    public static HungryManModel getInstance(){
        return INSTANCE;
    }

    //�����֣�2
    private static  HungryManModel INSTANCE2 = null;
    static {
        INSTANCE2 = new HungryManModel();
    }
    public static HungryManModel getInstance2(){
        return INSTANCE2;
    }

}
