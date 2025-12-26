package com.problems;

public class Product {
	
	String productName;
	int price;
	
	static int totalProducts;
	
	void displayProductDetails() {
		System.out.print("product name is "+this.productName+", price of the product is "+price);
	}
	
	static void displayTotalProducts() {
		System.out.print(totalProducts);
	}
	Product(String productName, int price){
		this.productName=productName;
		this.price=price;
		totalProducts++;
	}
   public static void main(String [] args) {
	   
	   Product product1=new Product("table",4000);
//	   Product product2=new Product("chair",4000);
	   displayTotalProducts();
   }
}
