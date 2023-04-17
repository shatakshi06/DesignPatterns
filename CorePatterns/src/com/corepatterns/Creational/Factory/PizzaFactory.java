package com.corepatterns.Creational.Factory;

public class PizzaFactory {

	public static Pizza getPizzaInstance(String type) {
		Pizza pizza = null;
		
		if(type.equals("Veggie")) {
			pizza = new VeggiePizza();
		} else
		if(type.equals("Chicken")) {
			pizza = new ChickenPizza();
		}
		
		return pizza;
				
	}
}

