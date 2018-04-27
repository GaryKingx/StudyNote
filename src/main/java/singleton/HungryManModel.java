package singleton;

/**
 * 饿汉模式
 * 类加载中就创建静态对象 天生线程安全
 * create by frank
 * on 2018/04/27
 */
public class HungryManModel {
    //第五种： 1
    private static final HungryManModel INSTANCE = new HungryManModel();
    public static HungryManModel getInstance(){
        return INSTANCE;
    }

    //第六种：2
    private static  HungryManModel INSTANCE2 = null;
    static {
        INSTANCE2 = new HungryManModel();
    }
    public static HungryManModel getInstance2(){
        return INSTANCE2;
    }

}
