package com.corepatterns.Behavioral.Decorator;

public class VeggieDecorator extends PizzaDecorator{

	public VeggieDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public void bake() {
		super.bake();
		System.out.println("Adding Veggies to the Pizza");
	}

}
