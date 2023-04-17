package com.corepatterns.Behavioral.Decorator;

public class PizzaShop {

	public static void main(String[] args) {
		
		Pizza pizza = new VeggieDecorator(new PlainPizza());
		pizza.bake();
		
		Pizza pizzaDeluxe = new CheeseDecorator(new VeggieDecorator(new PlainPizza()));
		pizzaDeluxe.bake();
	}

}
