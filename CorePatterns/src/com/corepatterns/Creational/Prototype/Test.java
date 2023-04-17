package com.corepatterns.Creational.Prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Game game = new Game();
		game.setId(1);
		game.setName("Basketball");
		game.setMembership(new Membership());
		
		Game game2 = game.clone();
		
		System.out.println(game);
		System.out.println(game2);
	}

}
