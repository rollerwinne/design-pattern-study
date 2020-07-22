package atguigu_shulou;

/**
 * @author shulou
 * @date 2020/7/21 9:45 下午
 */
public class TestChongZai {
    void method(Object o){
        System.out.println("o");
    }
    void method(A a){
        System.out.println("A");
    }

    void method(B b){
        System.out.println("B");
    }

    void method(Integer i){
        System.out.println("I");
    }

    void method(int i){
        System.out.println("i");
    }

    public static void main(String[] args) {
        new TestChongZai().method(1);
    }

}
class A{

}

class B extends A{

}