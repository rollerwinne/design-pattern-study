package atguigu.factory.factorymethod.pizzastore.order;

import atguigu.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import atguigu.factory.factorymethod.pizzastore.pizza.Pizza;
import atguigu.factory.factorymethod.pizzastore.pizza.LDCheesePizza;


public class LDOrderPizza extends OrderPizza {

	
	@Override
    Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
