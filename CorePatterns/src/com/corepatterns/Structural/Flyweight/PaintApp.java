package com.corepatterns.Structural.Flyweight;

public class PaintApp {

	public void drawShapes(int numberOfShapes) {
		
		Shape shape = null;
		
		for(int i=1; i<=numberOfShapes; i++) {
			
			if(i%2 == 0) {
				shape = ShapeFactory.getShape("Circle");
				shape.draw(4, "Orange");
			} else {
				shape = ShapeFactory.getShape("Rectangle");
				shape.draw(4, 8, "Dotted");
			}
		}
	}
}
