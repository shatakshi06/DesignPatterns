package com.corepatterns.Behavioral.Decorator;

public class PizzaDecorator implements Pizza{

	Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public void bake() {
		// TODO Auto-generated method stub
		pizza.bake();
	}

}
