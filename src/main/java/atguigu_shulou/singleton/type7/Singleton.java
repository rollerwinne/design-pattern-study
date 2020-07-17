package atguigu_shulou.singleton.type7;

/**
 * 单例模式:静态内部类
 */
public class Singleton {
    private Singleton() {
    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
