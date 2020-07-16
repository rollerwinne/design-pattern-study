package shulou.factory.method;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza=null;
        if (type.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek pizza");
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (type.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
