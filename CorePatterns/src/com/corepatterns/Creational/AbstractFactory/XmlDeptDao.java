package com.corepatterns.Creational.AbstractFactory;

public class XmlDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving the Department Info to the XML");

	}

}
