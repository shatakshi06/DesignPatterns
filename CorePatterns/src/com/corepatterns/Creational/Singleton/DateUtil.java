package com.corepatterns.Creational.Singleton;

import java.io.Serializable;

public class DateUtil implements Serializable,Cloneable {

	private static final long serialVersionUID = 1L;
	private static volatile DateUtil instance;
	
	/* For Eager Initialization:
	 * 
	 * private static DateUtil instance = new DateUtil(); OR
	 * static {
	 *     instance = new DateUtil();
	 * }
	 * 
	 * For making the Singleton class thread safe, we can declare the method "synchronized"
	 * Instead of making the entire method, we can declare a sync.. block and declare the 
	 * instance variable as Volatile.
	*/
	
	private DateUtil() {}
	
	public static DateUtil getInstance() {
		
		if(instance == null) {
		  synchronized(DateUtil.class) {
		   if(instance == null) {
			   instance = new DateUtil();
	       }
		  }
		}
		
		return instance;
	}
	
	// For Deserialization
	public Object readResolve() {
		return instance;
	}
	
	// Prevent our class from cloning if any other class extends it.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return new CloneNotSupportedException();
	}
}
