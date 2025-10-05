package com.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.app.dto.ProductDTO;
import com.app.myBatis.config.MyBatisConfig;
import com.app.vo.ProductVO;

public class ProductDAO {
//	매번 sqlSession을 생성하지 않기위해 필드에 선언해주고 참조해서 사용한다
	public SqlSession sqlSession;
	
	public ProductDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	public void insert(ProductVO productVO) {
		sqlSession.insert("product.insert", productVO);
	}
	
	public List<ProductDTO> select(Long id) {
		return sqlSession.selectList("product.select", id);
	}
	
	public List<ProductDTO> selectAll() {
		return sqlSession.selectList("product.selectAll");
	}
}



