package com.corepatterns.Behavioral.Command;

// This is a Client class.
public class Person {

	public static void main(String[] args) {
		
		Television television = new Television();
		RemoteControl remoteControl = new RemoteControl();
		
		Command command = new OnCommand(television);
		remoteControl.setCommand(command);
		remoteControl.pressButton();
	}

}
