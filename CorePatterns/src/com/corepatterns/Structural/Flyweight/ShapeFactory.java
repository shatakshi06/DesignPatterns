package com.corepatterns.Structural.Flyweight;

import java.util.HashMap;

public class ShapeFactory {

	private static HashMap<String,Shape> shapes = new HashMap<String,Shape>();
	
	public static Shape getShape(String type) {
		
		Shape shape = null;
		
		if(shapes.get(type) != null) {
			shape = shapes.get(type);
		} else {
			if(type.equals("Circle")) {
				shape = new Circle();
			} else {
				shape = new Rectangle();
			}
		}
		
		return shape;
	}
}
