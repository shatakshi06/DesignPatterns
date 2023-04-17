package com.corepatterns.Creational.Factory;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		
		Pizza pizzaOrder = PizzaFactory.getPizzaInstance(type);
		
		pizzaOrder.prepare();
		pizzaOrder.bake();
		pizzaOrder.cut();
		
		return pizzaOrder;
	}
}
