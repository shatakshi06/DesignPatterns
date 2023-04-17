package com.corepatterns.Creational.AbstractFactory;

public class DaoMaker {

	public static AbstractDaoFactory getAbstractDaoFactoryInstance(String type) {
		AbstractDaoFactory abstractDaoFactory = null;
		
		if(type.equals("XML")) {
			abstractDaoFactory = new XmlDaoFactory();
		} else
		if(type.equals("DB")) {
			abstractDaoFactory = new DbDaoFactory();
		}
		
		return abstractDaoFactory;
	}
}
