package com.jeepatterns.Ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer {

	//@Autowired
	private CreditCard creditCard;
	
	public CustomerImpl(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	@Override
	public void pay() {
		getCreditCard().makePayment();
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	@Autowired
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

}
