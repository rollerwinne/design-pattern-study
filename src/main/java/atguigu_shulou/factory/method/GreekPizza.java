package atguigu_shulou.factory.method;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }

    public static Pizza createPizza(String type) {
        Pizza pizza = new GreekPizza();
        pizza.name = "希腊披萨";
        return pizza;
    }
}
