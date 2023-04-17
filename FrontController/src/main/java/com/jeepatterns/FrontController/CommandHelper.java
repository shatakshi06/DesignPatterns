package com.jeepatterns.FrontController;

public class CommandHelper {

	public Command getCommand(String requestURI) {
		
		if(requestURI.contains("viewStudentDetails.do")) {
			return new ViewStudentCommand();
		}
		return null;
	}

}
