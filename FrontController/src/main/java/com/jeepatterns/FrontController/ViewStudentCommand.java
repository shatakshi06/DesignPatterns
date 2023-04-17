package com.jeepatterns.FrontController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewStudentCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {

		StudentVO studentVO = new StudentVO(61 , "Shatakshi");
		request.setAttribute("studentDetails", studentVO);
		
		return "showStudentDetails";
	}

}
