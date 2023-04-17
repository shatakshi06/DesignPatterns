package com.corepatterns.Creational.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflectionProblem {

	public static void main(String[] args) {
		
		DateUtil dateUtil = DateUtil.getInstance();
		DateUtil instance2 = null;
		
		Constructor[] constructors = DateUtil.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			
			try {
				instance2 = (DateUtil) constructor.newInstance();
				break;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(dateUtil.hashCode());
		System.out.println(instance2.hashCode());

	}

}
