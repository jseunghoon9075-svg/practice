package com.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.app.myBatis.config.MyBatisConfig;
import com.app.vo.UserVO;

public class UserDAO {
//	매번 sqlSession을 생성하지 않기위해 필드에 선언해주고 참조해서 사용한다
	public SqlSession sqlSession;
	
	public UserDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(UserVO userVO) {
		sqlSession.insert("user.insert", userVO);
	}
	
	public UserVO select(UserVO userVO) {
		return sqlSession.selectOne("user.select", userVO);
	}
	
	public Long findByUserId(String userEmail) {
		return sqlSession.selectOne("user.selectIdByUserEmail", userEmail);
	}
	
}



