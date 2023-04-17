package com.corepatterns.Structural.Adapter;

public class WeatherUI {

	public int findTempertaure(int zipcode) {
		
		WeatherAdapter adapter = new WeatherAdapter();
		int temp = adapter.getTemperature(zipcode);
		
		System.out.println(temp);
		return temp;
		
	}
	
	public static void main(String args[]) {
		WeatherUI weatherUI = new WeatherUI();
		weatherUI.findTempertaure(282005);
	}
}
