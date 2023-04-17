package com.corepatterns.Behavioral.Decorator;

public class CheeseDecorator extends PizzaDecorator{

	public CheeseDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public void bake() {
		super.bake();
		System.out.println("Adding Cheese to the Pizza");
	}

}
