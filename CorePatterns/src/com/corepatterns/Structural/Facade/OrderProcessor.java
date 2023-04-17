package com.corepatterns.Structural.Facade;

public class OrderProcessor {

	public boolean checkStock(String productName) {
		System.out.println("The product is in stock");
		return true;
	}
	
	public String placeOrder(String productName, int quantity) {
		System.out.println("The order is placed");
		 return "12345tyuv";
	}
	
	public String shipOrder(String orderId) {
		
		return "The order is shipped";
	}
}
