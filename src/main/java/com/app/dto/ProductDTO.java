package com.app.dto;

import java.util.Objects;

public class ProductDTO {
	private Long id;
	private String productName;
	private Integer productPrice;
	private Integer productStock;
	private Long companyId;
	private String companyName;
	private String companyPhone;
	private String companyAddress;
	
	public ProductDTO() {;}

	public ProductDTO(Long id, String productName, Integer productPrice, Integer productStock, Long companyId,
			String companyName, String companyPhone, String companyAddress) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyPhone = companyPhone;
		this.companyAddress = companyAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductStock() {
		return productStock;
	}

	public void setProductStock(Integer productStock) {
		this.productStock = productStock;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
		return "ProductDTO [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productStock=" + productStock + ", companyId=" + companyId + ", companyName=" + companyName
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
		ProductDTO other = (ProductDTO) obj;
		return Objects.equals(id, other.id);
	}
	
}
