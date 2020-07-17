package ituring_shulou.prototype;

import ituring_shulou.prototype.framework.Manager;
import ituring_shulou.prototype.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 准备
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 生成
        Product p1 = manager.create("strong message");
        Product p11 = manager.create("strong message");
        p1.use("Hello, world.");
        p11.use("Hello, world.");
        System.out.println(p1.equals(p11));

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
