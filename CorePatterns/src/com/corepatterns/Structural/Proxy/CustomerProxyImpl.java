package com.corepatterns.Structural.Proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {

	CustomerImpl customerImpl = new CustomerImpl();
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return customerImpl.getId();
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		
		List<Order> orders = new ArrayList<>();
		Order order = new Order();
		order.setId(1);
		order.setName("Samsung Fold 4");
		order.setQuantity(700);
		
		orders.add(order);
		return orders;
	}

}
