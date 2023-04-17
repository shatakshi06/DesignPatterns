package com.corepatterns.Structural.Adapter.Assignment;

public class PaymentProcessorImplementation implements PaymentProcessor {

	@Override
	public String pay(int dollars) {
		
		return "Payment is successfull";
	}

}
