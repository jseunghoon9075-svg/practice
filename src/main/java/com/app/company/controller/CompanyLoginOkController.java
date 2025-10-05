package com.app.company.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.Action;
import com.app.Result;
import com.app.dao.CompanyDAO;
import com.app.vo.CompanyVO;

public class CompanyLoginOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		String companyName = null, companyPassword = null;
		CompanyDAO companyDAO = new CompanyDAO();
		CompanyVO companyVO = new CompanyVO();
		HttpSession session = req.getSession();
		
		companyName = req.getParameter("companyName"); 
		companyPassword = req.getParameter("companyPassword"); 
		
		companyVO.setCompanyName(companyName);
		companyVO.setCompanyPassword(companyPassword);
		
		CompanyVO foundCompany = companyDAO.select(companyVO);
		
//		로그인 실패
		result.setRedirect(true);
		if(foundCompany == null) {
			result.setPath("/practice/login.company?isFail=true");
			return result;
		}
		
//		로그인 성공
		session.setAttribute("company", foundCompany);
		
		result.setRedirect(true);
		result.setPath("/practice");
		return result;
	}

}
