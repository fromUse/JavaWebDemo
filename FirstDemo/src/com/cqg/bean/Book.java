package com.cqg.bean;

public class Book {
	/*
	 * 
	 * 
	 * <book>
		<id>1</id>
		<name>疯狂Java讲义(附光盘)</name>
		<author>李刚 编著</author>
		<price>74.20</price>
		<image>java.jpg</image>
		<remark>疯狂源自梦想,技术成就辉煌 本书来自作者3年的Java培训经历,凝结了作者近3000个小时的授课经验,总结了几百个Java学员学习过程中的典型错误.</remark>
	*</book>
	 * 
	*/
	private Integer id;
	private String name;
	private String author;
	private Float price;
	private String image;
	private String remark;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author
				+ ", price=" + price + ", image=" + image + ", remark="
				+ remark + "]";
	}
	
	
	
	
}
