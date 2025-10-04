package com.app.company.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.CompanyDAO;
import com.app.vo.CompanyVO;

public class CompanyJoinOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		String companyName = null, companyPassword = null, companyPhone = null, companyAddress = null;
		CompanyDAO companyDAO = new CompanyDAO();
		CompanyVO companyVO = new CompanyVO();
		
		companyName = req.getParameter("companyName");
		companyPassword = req.getParameter("companyPassword");
		companyPhone = req.getParameter("companyPhone");
		companyAddress = req.getParameter("companyAddress");
		
		companyVO.setCompanyName(companyName);
		companyVO.setCompanyPassword(companyPassword);
		companyVO.setCompanyPhone(companyPhone);
		companyVO.setCompanyAddress(companyAddress);
		req.setAttribute("company", companyVO);
		companyDAO.insert(companyVO);
		
		result.setRedirect(true);
		result.setPath("/practice/company.jsp");
		return result;
	}

}
