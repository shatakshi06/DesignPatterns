package com.corepatterns.Behavioral.Template.Assignment;

public class LaptopManufacturer extends ComputerManufacturer{

	@Override
	public String addHardDisk() {
	
		return "Added Hard Disk to Laptop";
	}

	@Override
	public String addRam() {
		
		return "Added Ram to Laptop";
	}

	@Override
	public String addSpeakers() {
		
		return "Added Speakers to Laptop";
	}

}
