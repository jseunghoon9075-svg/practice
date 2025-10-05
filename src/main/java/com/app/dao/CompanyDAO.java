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
//	기업 회원가입
	public void insert(CompanyVO companyVO) {
		sqlSession.insert("company.insert", companyVO);
	}
	
//	기업 로그인
	public CompanyVO select(CompanyVO companyVO) {
		return sqlSession.selectOne("company.select", companyVO);
	}
	
	public Long findIdByCompanyName(CompanyVO companyVO) {
		return sqlSession.selectOne("company.selectIdByCompanyName", companyVO);
	}
}



