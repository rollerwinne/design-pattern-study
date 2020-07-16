package shulou.singleton.type6;

/**
 * 单例模式:懒汉式(双重检查)
 */
public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
