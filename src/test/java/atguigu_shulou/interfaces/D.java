package atguigu_shulou.interfaces;

/**
 * @author shulou
 * @date 2020/7/20 9:17 下午
 */
public class D {
    public static void method(A a){
        System.out.println("a");
    }
//    public static void method(B b){
//        System.out.println("b");
//    }

    public static void main(String[] args) {
        C c=new C();
        method(c);
     }
}
