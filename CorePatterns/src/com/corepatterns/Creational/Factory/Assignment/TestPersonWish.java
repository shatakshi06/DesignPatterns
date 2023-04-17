package com.corepatterns.Creational.Factory.Assignment;

public class TestPersonWish {

	public static void main(String[] args) {
		
		Wish wishPerson = new Wish();
		wishPerson.personWish("Male", "All the best from Kanishk");
		
		Wish wishPerson2 = new Wish();
		wishPerson2.personWish("Female", "All the best from Shatakshi");
	}

}
