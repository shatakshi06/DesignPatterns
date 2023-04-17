package com.corepatterns.Behavioral.Command;

// This is a invoker class.
public class RemoteControl {

	Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}
}
