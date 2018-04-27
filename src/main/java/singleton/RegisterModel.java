package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * �Ǽ�ģ��
 * create by frank
 * on 2018/04/27
 * ���ڶ���ģʽ
 */
public class RegisterModel {
    //�����֣���Ҳ����ʡ�ԣ�
    private static Map<String, RegisterModel> instance = new HashMap<String,RegisterModel>();

    static {
        RegisterModel registerModel = new RegisterModel();
        instance.put(registerModel.getClass().getName(), registerModel);
    }

    public static RegisterModel getInstance(String name) {
        if (name == null)
            name = RegisterModel.class.getName();
        if (instance.get(name) == null) {
            try {
                instance.put(name, (RegisterModel) Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return instance.get(name);
    }
}
