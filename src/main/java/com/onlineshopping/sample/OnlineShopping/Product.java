package com.onlineshopping.sample.OnlineShopping;

public class Product {

	private int productId;
	private String image;
	private String desc;
	public Product(int i, String img, String description) {
		this.productId=i;
		this.image=img;
		this.desc=description;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
