package com.app.vo;

import java.util.Objects;

public class CardVO {

	Long id;
	String userCardName;
	String userCardNumbers;
	Long userId;
	
	public CardVO() {;}	
	
	public CardVO(Long id, String userCardName, String userCardNumbers, Long userId) {
		super();
		this.id = id;
		this.userCardName = userCardName;
		this.userCardNumbers = userCardNumbers;
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserCardName() {
		return userCardName;
	}

	public void setUserCardName(String userCardName) {
		this.userCardName = userCardName;
	}

	public String getUserCardNumbers() {
		return userCardNumbers;
	}

	public void setUserCardNumber(String userCardNumbers) {
		this.userCardNumbers = userCardNumbers;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "CardVO [id=" + id + ", userCardName=" + userCardName + ", userCardNumbers=" + userCardNumbers
				+ ", userId=" + userId + "]";
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
		CardVO other = (CardVO) obj;
		return Objects.equals(id, other.id);
	}
	
}
