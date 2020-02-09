package cn.edu.bupt.singleton.type4;

/**
 * 单例模式:懒汉式(线程安全,同步方法)
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
