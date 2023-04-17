package com.corepatterns.Structural.Flyweight;

public class Rectangle extends Shape {

	private String label;
	
	public Rectangle() {
		label = "Rectangle";
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public void draw(int length , int breadth , String linePattern) {
		
		System.out.println("We are drawing a " + label + "with the length as: " + length + 
				"and breadth: " + breadth + "using a line pattern as: " + linePattern);
	}

}
