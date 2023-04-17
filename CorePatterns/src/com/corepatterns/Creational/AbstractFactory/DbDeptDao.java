package com.corepatterns.Creational.AbstractFactory;

public class DbDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department Info to the Database");

	}

}
