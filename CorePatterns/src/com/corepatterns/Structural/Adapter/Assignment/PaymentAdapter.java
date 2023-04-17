package com.corepatterns.Structural.Adapter.Assignment;

public class PaymentAdapter {

	public String paymentAdapt(int rupees) {
		int amountInDollars = 0;
		
		if(rupees!=0) {
			amountInDollars = rupees * 80;
		}
		
		PaymentProcessor paymentProcessor = new PaymentProcessorImplementation();
		String finalPayment = paymentProcessor.pay(amountInDollars);
		
		return finalPayment;
	}
}
