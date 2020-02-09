package cn.edu.bupt.singleton.type2;

/**
 * 单例模式:饿汉式(静态代码块)
 */
public class Singleton {
    private static Singleton singleton;

    {
        singleton = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
