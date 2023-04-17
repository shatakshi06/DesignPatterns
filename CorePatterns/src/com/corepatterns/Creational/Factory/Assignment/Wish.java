package com.corepatterns.Creational.Factory.Assignment;

public class Wish {

	public Person personWish(String type , String wish) {
		Person personWish = PersonFactory.getPersonInstance(type);
		
		personWish.wish(wish);
		
		return personWish;
	}
}
