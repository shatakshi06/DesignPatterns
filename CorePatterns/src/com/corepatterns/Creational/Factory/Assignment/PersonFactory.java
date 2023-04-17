package com.corepatterns.Creational.Factory.Assignment;

public class PersonFactory {

	public static Person getPersonInstance(String gender) {
		Person person = null;
		
		if(gender.equals("Male")) {
			person = new Male();
		} else {
			person = new Female();
		}
		
		return person;
	}
}
