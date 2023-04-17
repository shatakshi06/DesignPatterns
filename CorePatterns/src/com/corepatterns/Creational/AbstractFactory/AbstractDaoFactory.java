package com.corepatterns.Creational.AbstractFactory;

public abstract class AbstractDaoFactory {
	
	public abstract Dao getDaoFactory(String type);
}
