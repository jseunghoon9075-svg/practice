package com.app.vo;

import java.util.Objects;

public class UserVO {

	private Long id;
	private String userEmail;
	private String userPassword;
	private String userName;
	private Integer userAge;
	private String userPhone;
	private String userAddress;
	
	public UserVO() {;}

	public UserVO(Long id, String userEmail, String userPassword, String userName, Integer userAge, String userPhone,
			String userAddress) {
		super();
		this.id = id;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userAge = userAge;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", userEmail=" + userEmail + ", userPassword=" + userPassword + ", userName="
				+ userName + ", userAge=" + userAge + ", userPhone=" + userPhone + ", userAddress=" + userAddress + "]";
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
		UserVO other = (UserVO) obj;
		return Objects.equals(id, other.id);
	}
	
}
