package com.model;

public class Product {
	private  int id;
	private String name;
	private String company;
	private int price;
	
//default constructor 	
	public Product() {}
	
// generated constructor	
	public Product(int id, String name, String company, int price) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
// generated getter setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
//generated to string
	public String toString() {
		return "\n Product [id=" + id + ", name=" + name + ", company=" + company + ", price=" + price + "]";
	}
	
}
