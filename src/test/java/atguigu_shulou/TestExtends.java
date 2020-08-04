package atguigu_shulou;

/**
 * @author shulou
 * @date 2020/7/23 8:36 下午
 */
public class TestExtends {
    public static void main(String[] args) {
        System.out.println(F.i);
    }
}

class E {
    {
        System.out.println("e 构造代码块");
    }

    static {
        System.out.println("e 静态代码块");
    }

    public E() {
        System.out.println("e 构造方法");
    }

    public E(String name) {
        System.out.println("e 构造方法:" + name);
    }
}

class F extends E {
    public static int i = 3;

    static {
        System.out.println("f 静态代码块");
    }

    {
        System.out.println("f 构造代码块");
    }

    public F() {
        System.out.println("f 构造方法");
    }

    public F(String name) {
        System.out.println("f 构造方法:" + name);
    }
}
