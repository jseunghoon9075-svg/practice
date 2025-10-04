package com.app.company;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.company.controller.CompanyJoinController;
import com.app.company.controller.CompanyJoinOkController;
import com.app.company.controller.CompanyLoginController;
import com.app.company.controller.CompanyLoginOkController;

public class CompanyFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html, charset=UTF-8");
		
		Result result = null;
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		System.out.println(target);
		
		
		if(target.equals("join")) {
			result = new CompanyJoinController().execute(req, resp);
		}else if(target.equals("join-ok")) {
			result = new CompanyJoinOkController().execute(req, resp);
		}else if(target.equals("login")) {
			result = new CompanyLoginController().execute(req, resp);
		}else if(target.equals("login-ok")) {
			result = new CompanyLoginOkController().execute(req, resp);
		}else if(target.equals("login")) {
		}else if(target.equals("login")) {
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
