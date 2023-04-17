package com.corepatterns.Behavioral.Template.Assignment;

public abstract class ComputerManufacturer {

	public void buildComputer() {
		String ramConfirmation = null, speakersConfirmation = null;
		String hardDiskConfirmation = addHardDisk();
		if(hardDiskConfirmation!=null) {
			ramConfirmation = addRam();
			if(ramConfirmation!=null) {
				speakersConfirmation = addSpeakers();
			}
		}
		
		System.out.println("The device is ready to manufacture: " + hardDiskConfirmation + 
				ramConfirmation + speakersConfirmation);
	}
	
	public abstract String addHardDisk();
	
	public abstract String addRam();
	
	public abstract String addSpeakers();
}
