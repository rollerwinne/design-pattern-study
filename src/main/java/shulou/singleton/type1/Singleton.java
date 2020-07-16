package shulou.singleton.type1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式:饿汉式(静态常量)
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
        // 破解方式
        // if (null != singleton) {
        //     throw new RuntimeException();
        // }
    }

    public static Singleton getInstance() {
        return singleton;
    }
}


class SingletonTest {
    /**
     * 利用反射破解单例（序列化也可破解）
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton.getInstance();
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor((Class<?>) null);
        constructor.setAccessible(true);
        Singleton singleton1 = constructor.newInstance();
        Singleton singleton2 = constructor.newInstance();
        System.out.println(singleton1 == singleton2);
    }

}


