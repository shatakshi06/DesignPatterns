package com.corepatterns.Structural.Adapter.Assignment;

public class PaymentApp {

	public String payAmount(int rupees) {
		
		PaymentAdapter paymentAdapter = new PaymentAdapter();
		String processedPay = paymentAdapter.paymentAdapt(rupees);
		System.out.println(processedPay);
		
		return processedPay;
		
	}
	
	public static void main(String args[]) {
		PaymentApp paymentApp = new PaymentApp();
		paymentApp.payAmount(60);
	}
}
