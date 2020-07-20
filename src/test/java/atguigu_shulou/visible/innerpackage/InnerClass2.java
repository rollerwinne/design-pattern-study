package atguigu_shulou.visible.innerpackage;

import atguigu_shulou.visible.OuterClass;
import atguigu_shulou.visible.OuterClass2;

/**
 * @author shulou
 * @date 2020/7/20 8:52 下午
 */
public class InnerClass2 {
    protected static int inner2;

    public static void main(String[] args) {
        int i1 = InnerClass.inner;
        int i2 = InnerClass2.inner2;
        int o1 = OuterClass.outer;
        int o2 = OuterClass2.outer2;
        int s = SubClass.sub;
    }
}
