package com.view;
import java.util.List;
import java.util.Scanner;
import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class test {
	public static void main(String[] args) {
		add();
		getAll();
		delete();
//	getall is again called to display product after deleted.
		getAll();
	}
	
	static void add() {
		ProductService ps = new ProductServiceImpl();
		char flag = 'y';
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("enter id");
			System.out.println("enter name");
			System.out.println("enter company");
			System.out.println("enter price");
			
			Product p = new Product(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
			ps.addProduct(p);
			
			System.out.println("do you want to add more[y/n]");
			flag = sc.next().charAt(0);
			
		}while(flag=='y');				
	}
	
	static void getAll() {
		ProductService ps = new ProductServiceImpl();
		List<Product> plist = ps.getAllProducts();
		System.out.println(plist);
	}
	
	
	static void delete() {
		ProductService ps = new ProductServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  index to delete product");
		ps.deleteProduct(sc.nextInt());
	}
	
	
	
	
	
	
	
	
	
}
