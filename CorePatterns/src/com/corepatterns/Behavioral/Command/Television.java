package com.corepatterns.Behavioral.Command;

// This is a Receiver Class.
public class Television {

	public void on() {
		System.out.println("Television switched On....");
	}
	
	public void off() {
		System.out.println("Television switched Off....");
	}
}
