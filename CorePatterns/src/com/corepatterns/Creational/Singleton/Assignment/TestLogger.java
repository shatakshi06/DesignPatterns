package com.corepatterns.Creational.Singleton.Assignment;

public class TestLogger {

	public static void main(String[] args) {
		
		Logger instance1 = Logger.getInstance();
		
		Logger instance2 = Logger.getInstance();
		
		System.out.println((instance1 == instance2) ? "Same instance" : "Different Ones");
		
		System.out.println(instance1.log("Shatakshi Jain"));
		System.out.println(instance2.log("Kanishk Bansal"));

	}

}
