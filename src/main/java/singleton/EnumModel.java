package singleton;

/**
 * √∂æŸ¿‡–Õ
 * create by frank
 * on 2018/04/27
 */
public enum EnumModel {
    INSTANCE;
    private Instance instance;

    EnumModel() {
        instance = new Instance();
    }

    public Instance getInstance() {
        return EnumModel.INSTANCE.instance;
    }
}

class Instance {
}