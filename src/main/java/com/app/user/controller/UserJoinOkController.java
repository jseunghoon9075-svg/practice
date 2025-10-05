package com.app.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.UserDAO;
import com.app.vo.UserVO;

public class UserJoinOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		UserVO userVO = new UserVO();
		UserDAO userDAO = new UserDAO();
		String userEmail = null, userPassword = null, userName = null, userPhone = null, userAddress = null;
		Integer  userAge = null;
		
		userEmail = req.getParameter("userEmail");
		userPassword = req.getParameter("userPassword");
		userName = req.getParameter("userName");
		userAge = Integer.parseInt(req.getParameter("userAge")); 
		userPhone = req.getParameter("userPhone");
		userAddress = req.getParameter("userAddress");
		
		userVO.setUserEmail(userEmail);
		userVO.setUserPassword(userPassword);
		userVO.setUserName(userName);
		userVO.setUserAge(userAge);
		userVO.setUserPhone(userPhone);
		userVO.setUserAddress(userAddress);
		
		
		
		req.setAttribute("user", userVO);
		userDAO.insert(userVO);
		
		result.setRedirect(true);
		result.setPath("/practice");
		return result;
	}

}
