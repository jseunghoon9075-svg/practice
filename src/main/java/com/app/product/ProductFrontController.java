package com.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.product.controller.ProductAddController;
import com.app.product.controller.ProductAddOkController;
import com.app.product.controller.ProductCompanyListController;
import com.app.product.controller.ProductUserListController;

public class ProductFrontController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html, charset=UTF-8");
		
		Result result = new Result();
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		
		System.out.println(target);
		
		if(target.equals("add")) {
			result = new ProductAddController().execute(req, resp);
		}else if(target.equals("add-ok")) {
			result = new ProductAddOkController().execute(req, resp);
		}else if(target.equals("companyList")) {
			result = new ProductCompanyListController().execute(req, resp);
		}else if(target.equals("userList")) {
			result = new ProductUserListController().execute(req, resp);
		}else if(target.equals("write-ok")) {
		}else if(target.equals("write-ok")) {
			
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
