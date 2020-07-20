package atguigu_shulou.visible;

import atguigu_shulou.visible.innerpackage.InnerClass;
import atguigu_shulou.visible.innerpackage.InnerClass2;
import atguigu_shulou.visible.innerpackage.SubClass;

/**
 * @author shulou
 * @date 2020/7/20 8:52 下午
 */
public class OuterClass {
    protected static int outer;

    public static void main(String[] args) {
        int i1 = InnerClass.inner;
        int i2 = InnerClass2.inner2;
        int o1 = OuterClass.outer;
        int o2 = OuterClass2.outer2;
        int s = SubClass.sub;
    }
}
