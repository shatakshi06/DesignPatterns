package com.corepatterns.Creational.Singleton;

/*
 * Enum is a way to solve the Reflection problem.
 * There is no constructor so no breaking into the class is possible.
*/
public enum EnumSingleton {

	INSTANCE;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
