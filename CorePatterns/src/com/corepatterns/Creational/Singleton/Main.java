package com.corepatterns.Creational.Singleton;

public class Main {

	public static void main(String[] args) {
		
		DateUtil dateUtil = DateUtil.getInstance();
		DateUtil newDateUtil = DateUtil.getInstance();
		
		System.out.println(dateUtil == newDateUtil);

	}

}
