package com.jeepatterns.Ioc;

import org.springframework.stereotype.Component;

@Component
public class CreditCardImpl implements CreditCard {

	@Override
	public void makePayment() {
		
		System.out.println("Payment has been done successfully");
	}

}
