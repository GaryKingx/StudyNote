package singleton;

/**
 * 懒汉模式
 * create by frank
 * on 2018/04/27
 */
public class LazyManModel {
    private static LazyManModel lazyManModel = null;
    public LazyManModel(){}
    //第一种：最简单模式 线程不安全
    public static LazyManModel getInstance(){
        if(lazyManModel == null){
            lazyManModel = new LazyManModel();
        }
        return lazyManModel;
    }

    //第二种：锁机制 实现线程安全
    public static synchronized LazyManModel getInstance2(){
        if(lazyManModel == null){
            lazyManModel = new LazyManModel();
        }
        return lazyManModel;
    }

    //第三种：双重检查锁
    public static synchronized LazyManModel getInstance3(){
        if(lazyManModel == null){
            //锁定类
            synchronized (LazyManModel.class){
                if(lazyManModel == null)
                    lazyManModel = new LazyManModel();
            }
        }
        return lazyManModel;
    }

    //第四种：静态内部类 与上面对比最优
    private  static class SingleTon{
        private static  final LazyManModel INSTANCE = new LazyManModel();
    }
    public static LazyManModel getInstance4(){
        return SingleTon.INSTANCE;
    }
}
