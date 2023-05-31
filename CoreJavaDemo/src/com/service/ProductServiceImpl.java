package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService{

//	static banayesi jati ota value haleni eutai object ma sabai store hunxa. so we make one object sharable using static
	
	static List<Product> plist = new ArrayList<>();

	@Override
	public void addProduct(Product product) {
		plist.add(product);
		System.out.println("==============add success =====size ="+plist.size());
	}

	@Override
	public void deleteProduct(int index) {
		plist.remove(index);
		
	}

	@Override
	public List<Product> getAllProducts() {
		
		return plist;
	}

}
