package atguigu_shulou;

import java.util.Random;

/**
 * 多例模式
 *
 * @author shulou
 * @date 2020/7/21 8:55 下午
 */
public class MultiInstance {
    private static final MultiInstance[] instances = new MultiInstance[]{new MultiInstance(), new MultiInstance()};

    private MultiInstance() {
    }

    public static MultiInstance getInstance(int i) {
        return instances[i];
    }

    public static MultiInstance getInstance() {
        Random random = new Random();
        return instances[random.nextInt(2)];
    }
}

enum MultiEnum{
    INTSTANCE1,INSTANCE2
}