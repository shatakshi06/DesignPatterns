package com.jeepatterns.FrontController;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Dispatcher {

	public void dispatch(HttpServletRequest request, HttpServletResponse response, String view) {
		
		if(view!=null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(mapPageToJSP(view));
			try {
				requestDispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}
	}

	private String mapPageToJSP(String view) {
		if(view.equals("showStudentDetails")) {
			return "showStudentDetails.jsp";
		}
		return null;
	}

}
