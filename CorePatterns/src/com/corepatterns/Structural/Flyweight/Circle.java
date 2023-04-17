package com.corepatterns.Structural.Flyweight;

public class Circle extends Shape {

	private String label;

	public Circle() {
		label = "Circle";
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public void draw(int radius , String fillcolor) {

		System.out.println("We are drawing a " + label + "with the radius of: " + radius 
				+ "and filling the circle with " + fillcolor + "color");
	}

}
