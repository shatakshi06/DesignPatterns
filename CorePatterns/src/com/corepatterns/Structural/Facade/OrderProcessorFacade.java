package com.corepatterns.Structural.Facade;

public class OrderProcessorFacade {
	
	OrderProcessor orderProcessor = new OrderProcessor();
	
	public void processOrder(String productName , int quantity) {
		if(orderProcessor.checkStock(productName)) {
			String orderId = orderProcessor.placeOrder(productName, quantity);
			orderProcessor.shipOrder(orderId);
		}
 	}

}
