package com.app.card;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.card.controller.CardAddController;
import com.app.card.controller.CardAddOkController;

public class CardFrontController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html, charset=UTF-8");
		
		Result result = null;
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		System.out.println(target);
		
		if(target.equals("add")) {
			result = new CardAddController().execute(req, resp);
		}else if(target.equals("add-ok")) {
			result = new CardAddOkController().execute(req, resp);
			
		}
		
		
		
		if(result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			} else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
