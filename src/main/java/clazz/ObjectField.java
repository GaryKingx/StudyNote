package clazz;


import java.lang.reflect.Field;

/**
 * create by frank
 * on 2018/02/26
 * ������������
 */
public class ObjectField<T> {

    public void print(T model) throws IllegalAccessException {

        Class<T> tClass = (Class<T>) model.getClass();
        Field[] fields = tClass.getDeclaredFields();
        for (Field field : fields){
            System.out.println("������:"+field.getName()+",����ֵ"+field.get(model));
        }

    }

    public static void main(String[] args) throws IllegalAccessException {
        People people = new People();
        people.setName("frank");
        ObjectField<People> objectField = new ObjectField<People>();
        objectField.print(people);
    }
}
