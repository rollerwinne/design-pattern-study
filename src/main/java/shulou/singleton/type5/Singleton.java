package shulou.singleton.type5;

/**
 * 单例模式:懒汉式(线程安全(false),同步代码块)
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
