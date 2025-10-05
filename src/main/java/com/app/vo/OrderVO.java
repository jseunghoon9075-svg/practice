package com.app.vo;

import java.util.Objects;

public class OrderVO {
//	ID NUMBER CONSTRAINT PK_ORDER PRIMARY KEY,
//	ORDER_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
//	USER_ID NUMBER,
//	PRODUCT_ID NUMBER,
	Long id;
	String orderDate;
	Long userId;
	Long productId;
	Integer productCount;
	
	public OrderVO() {;}

	public OrderVO(Long id, String orderDate, Long userId, Long productId, Integer productCount) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.userId = userId;
		this.productId = productId;
		this.productCount = productCount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	@Override
	public String toString() {
		return "OrderVO [id=" + id + ", orderDate=" + orderDate + ", userId=" + userId + ", productId=" + productId
				+ ", productCount=" + productCount + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderVO other = (OrderVO) obj;
		return Objects.equals(id, other.id);
	}
	
}
