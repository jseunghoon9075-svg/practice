package com.app.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;

import com.app.Action;
import com.app.Result;
import com.app.dao.CompanyDAO;
import com.app.dao.ProductDAO;
import com.app.vo.CompanyVO;

public class ProductCompanyListController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		ProductDAO productDAO = new ProductDAO();
		CompanyDAO companyDAO = new CompanyDAO();
		CompanyVO companyVO = new CompanyVO();
		HttpSession session = req.getSession();
		JSONArray products = new JSONArray();
		
		companyVO = (CompanyVO)session.getAttribute("company"); 
		Long companyId = companyVO.getId();
		System.out.println(companyId);
		
		productDAO.select(companyId).stream().map(JSONObject::new).forEach(products::put);
		req.setAttribute("productList", products);
		
		
		
		result.setPath("/product/companyList.jsp");
		return result;
	}

}
