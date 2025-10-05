package com.app.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.Action;
import com.app.Result;
import com.app.dao.UserDAO;
import com.app.vo.UserVO;

public class UserLoginOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		UserDAO userDAO = new UserDAO();
		UserVO userVO = new UserVO();
		String userEmail = null, userPassword = null, foundEmail = null;
		HttpSession session = req.getSession();
		
		userEmail = req.getParameter("userEmail"); 
		userPassword = req.getParameter("userPassword");
		
		userVO.setUserEmail(userEmail);
		userVO.setUserPassword(userPassword);
		
		userVO = userDAO.select(userVO);
		
		result.setRedirect(true);
		
		if(userVO == null) {
			result.setPath("/practice/login.user?isFail=true");
			return result;
		}
		
		session.setAttribute("user", userVO);
		
		result.setPath("/practice");
		result.setRedirect(true);
		
		return result;
	}

}
