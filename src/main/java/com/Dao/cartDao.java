package com.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Bean.ECartBean;
@Repository
public class cartDao {

	@Autowired
	JdbcTemplate stmt;

	public void addToCart(ECartBean cartBean) {
		stmt.update("insert into cart (productId,userId) values (?,?)", cartBean.getProductId(), cartBean.getUserId());
	}

	// productId userId
}
