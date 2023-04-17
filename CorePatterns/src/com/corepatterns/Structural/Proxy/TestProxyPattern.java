package com.corepatterns.Structural.Proxy;

public class TestProxyPattern {

	public static void main(String[] args) {
		
		Customer customer = new CustomerProxyImpl();
		System.out.println(customer.getId());
		System.out.println(customer.getOrders());
	}

}
