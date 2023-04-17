package com.jeepatterns.FrontController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Command {

	String execute(HttpServletRequest request, HttpServletResponse response);
}
