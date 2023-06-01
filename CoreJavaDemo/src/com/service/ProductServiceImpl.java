package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService{
	
	
	@Override
	public void addProduct(Product product) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "");
			String sql = "insert into productdetail(name,company,price)values('"+product.getName()+"','"+product.getCompany()+"','"+product.getPrice()+"')";
			Statement stm = con.createStatement();
			stm.execute(sql);
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}			
	}

	@Override
	public void deleteProduct(int index) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "");

			String sql = "delete from productdetail where id = 1";
			Statement stm = con.createStatement();
			stm.execute(sql);		
			System.out.println("delete success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		
	}

	@Override
	public void getAllProducts(Product product) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "");

			String sql = "select * from productdetail ";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("Id = " + rs.getInt("id"));
				System.out.println("Name = " + rs.getString("name"));
				System.out.println("Company = " + rs.getString("company"));
				System.out.println("Price = " + rs.getString("price"));
				System.out.println("===================");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
