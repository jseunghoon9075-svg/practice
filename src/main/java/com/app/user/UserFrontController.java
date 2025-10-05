package com.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.user.controller.UserJoinController;
import com.app.user.controller.UserJoinOkController;
import com.app.user.controller.UserLoginController;
import com.app.user.controller.UserLoginOkController;
import com.app.user.controller.UserLogoutOkController;

public class UserFrontController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html, charset=UTF-8");
		
		Result result = null;
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		System.out.println(target);
		
		if(target.equals("join")) {
			result = new UserJoinController().execute(req, resp);
		}else if(target.equals("join-ok")) {
			result = new UserJoinOkController().execute(req, resp);
		}else if(target.equals("login")) {
			result = new UserLoginController().execute(req, resp);
		}else if(target.equals("login-ok")) {
			result = new UserLoginOkController().execute(req, resp);
		}else if(target.equals("logout-ok")) {
			result = new UserLogoutOkController().execute(req, resp);
		}else {
			
		}
		
		
		if(result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			}else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
