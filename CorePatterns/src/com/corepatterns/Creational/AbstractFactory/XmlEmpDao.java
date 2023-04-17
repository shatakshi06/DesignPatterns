package com.corepatterns.Creational.AbstractFactory;

public class XmlEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving the Employee Info to the XML");

	}

}
