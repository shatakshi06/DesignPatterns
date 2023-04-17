package com.corepatterns.Behavioral.Template;

public abstract class DataRenderer {

	public void render() {
		
		String data = readData();
		String processedData = processData(data);
		System.out.println("Processed data is: " + data);
	}
	
	public abstract String readData();
	
	public abstract String processData(String data);
}
