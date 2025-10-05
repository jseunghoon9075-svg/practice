package com.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.app.myBatis.config.MyBatisConfig;
import com.app.vo.CardVO;

public class CardDAO {
//	매번 sqlSession을 생성하지 않기위해 필드에 선언해주고 참조해서 사용한다
	public SqlSession sqlSession;
	
	public CardDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(CardVO cardVO) {
		sqlSession.insert("card.insert", cardVO);
	}
	
}



