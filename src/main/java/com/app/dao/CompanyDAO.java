package com.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.app.myBatis.config.MyBatisConfig;
import com.app.vo.CompanyVO;

public class CompanyDAO {
//	매번 sqlSession을 생성하지 않기위해 필드에 선언해주고 참조해서 사용한다
	public SqlSession sqlSession;
	
	public CompanyDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	public void insert(CompanyVO companyVO) {
		sqlSession.insert("company.insert", companyVO);
	}
	
//	로그인
	public String select(CompanyVO companyVO) {
		return sqlSession.selectOne("company.select", companyVO);
	}
}



