package atguigu_shulou.factory.simple;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        Pizza pizza=PizzaFactory.createPizza("greek");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
