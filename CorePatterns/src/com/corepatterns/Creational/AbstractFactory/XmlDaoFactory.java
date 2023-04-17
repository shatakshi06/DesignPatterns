package com.corepatterns.Creational.AbstractFactory;

public class XmlDaoFactory extends AbstractDaoFactory{

	@Override
	public Dao getDaoFactory(String type) {
		Dao daoType = null;
		
		if(type.equals("Emp")) {
			daoType = new XmlEmpDao();
		} else 
		if(type.equals("Dept")) {
			daoType = new XmlDeptDao();
		}
		
		return daoType;
	}

}
