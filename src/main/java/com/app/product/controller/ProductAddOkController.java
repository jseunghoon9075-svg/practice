package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.Action;
import com.app.Result;
import com.app.dao.CompanyDAO;
import com.app.dao.ProductDAO;
import com.app.vo.CompanyVO;
import com.app.vo.ProductVO;

public class ProductAddOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		ProductDAO productDAO = new ProductDAO();
		ProductVO productVO = new ProductVO();
		CompanyDAO companyDAO = new CompanyDAO();
		CompanyVO companyVO = new CompanyVO();
		HttpSession session = req.getSession();
		String productName = null;
		Long productId = null;
		Integer productPrice = null, productStock = null;
		
		
		productName = req.getParameter("productName");
		productPrice = Integer.parseInt(req.getParameter("productPrice"));
		productStock = Integer.parseInt(req.getParameter("productStock"));
		companyVO = (CompanyVO)session.getAttribute("company");
		
		Long companyId = companyDAO.findIdByCompanyName(companyVO);
		
		System.out.println(companyId);
		productVO.setProductName(productName);
		productVO.setProductPrice(productPrice);
		productVO.setProductStock(productStock);
		productVO.setCompanyId(companyId);
		
		productDAO.insert(productVO);
		
		result.setRedirect(true);
		result.setPath("/practice/");
		return result;
	}

}
