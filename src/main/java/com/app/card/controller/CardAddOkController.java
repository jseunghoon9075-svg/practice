package com.app.card.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.Action;
import com.app.Result;
import com.app.dao.CardDAO;
import com.app.dao.UserDAO;
import com.app.vo.CardVO;
import com.app.vo.UserVO;

public class CardAddOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		UserDAO userDAO = new UserDAO();
		CardDAO cardDAO = new CardDAO();
		CardVO cardVO = new CardVO();
		UserVO userVO = new UserVO();
		HttpSession session = req.getSession();
		String cardName = null, cardNumber = null, foundUser = null;
		
		cardName = req.getParameter("userCardName"); 
		cardNumber = req.getParameter("userCardNumber");
		userVO = (UserVO)session.getAttribute("user");
		foundUser = userVO.getUserEmail();
		Long userId = userDAO.findByUserId(foundUser);
		
		cardVO.setUserCardName(cardName);
		cardVO.setUserCardNumber(cardNumber);
		cardVO.setUserId(userId);
		
		cardDAO.insert(cardVO);
		
		result.setPath("/practice/");
		result.setRedirect(true);
		return result;
	}

}
