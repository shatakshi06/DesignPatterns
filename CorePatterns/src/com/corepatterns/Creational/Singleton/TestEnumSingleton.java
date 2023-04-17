package com.corepatterns.Creational.Singleton;

public class TestEnumSingleton {

	public static void main(String[] args) {
		
		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		System.out.println(enumSingleton.getName());
		enumSingleton.setName("Shatakshi");
		System.out.println(enumSingleton.getName());

	}

}
