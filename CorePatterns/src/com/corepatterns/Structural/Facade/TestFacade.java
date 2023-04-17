package com.corepatterns.Structural.Facade;

public class TestFacade {

	public static void main(String[] args) {
		
		OrderProcessorFacade facade = new OrderProcessorFacade();
		facade.processOrder("Headphone", 8);
	}

}
