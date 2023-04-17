package com.corepatterns.Creational.AbstractFactory;

public class DbEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Employee Info to the Database");

	}

}
