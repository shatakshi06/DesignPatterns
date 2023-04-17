package com.corepatterns.Structural.Adapter;

public class WeatherAdapter {

	public int getTemperature(int zipcode) {
		String city = null;
		if(zipcode == 282005) {
			city = "Agra";
		}
		WeatherFinder weatherFinder = new WeatherFinderImpl();
		int temperature = weatherFinder.find(city);
		
		return temperature;
	}
}
