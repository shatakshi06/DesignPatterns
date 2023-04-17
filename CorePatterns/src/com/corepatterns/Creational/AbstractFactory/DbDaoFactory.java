package com.corepatterns.Creational.AbstractFactory;

public class DbDaoFactory extends AbstractDaoFactory{

	@Override
	public Dao getDaoFactory(String type) {
		Dao daoType = null;
		
		if(type.equals("Emp")) {
			daoType = new DbEmpDao();
		} else 
		if(type.equals("Dept")) {
			daoType = new DbDeptDao();
		}
		
		return daoType;
	}

}

