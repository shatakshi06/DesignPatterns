package com.corepatterns.Creational.Singleton.Assignment;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;

	private static volatile Logger loggerInstance;
	
	private Logger() {}
	
	public static Logger getInstance() {
		if(loggerInstance == null) {
			synchronized (Logger.class) {
				if(loggerInstance == null) {
					loggerInstance = new Logger();
				}
			}
		}
		
		return loggerInstance;
	}
	
	public Object readResolve() {
		return loggerInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return new CloneNotSupportedException();
	}
	
	public String log(String message) {
		return message;
	}

	
}
