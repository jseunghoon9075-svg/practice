package com.app.vo;

import java.util.Objects;

public class CompanyVO {
	private Long id;
	private String companyName;
	private String companyPassword;
	private String companyPhone;
	private String companyAddress;
	
	public CompanyVO() {;}

	public CompanyVO(Long id, String companyName, String companyPassword, String companyPhone, String companyAddress) {
		this.id = id;
		this.companyName = companyName;
		this.companyPassword = companyPassword;
		this.companyPhone = companyPhone;
		this.companyAddress = companyAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyPassword() {
		return companyPassword;
	}

	public void setCompanyPassword(String companyPassword) {
		this.companyPassword = companyPassword;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Override
	public String toString() {
		return "CompanyVO [id=" + id + ", companyName=" + companyName + ", companyPassword=" + companyPassword
				+ ", companyPhone=" + companyPhone + ", companyAddress=" + companyAddress + "]";
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
		CompanyVO other = (CompanyVO) obj;
		return Objects.equals(id, other.id);
	}
	
}
