package com.ibm.shop;
public class Product {
	private String productName;
	private double Cost;
	
	public Product() {
		
	}
	public Product(String productName, double cost) {
		this.productName = productName;
		this.Cost = cost;
	}
	 public double getprice() {
		 return Cost;
	 }
	 public void description()
	 {
		 System.out.println("Name:"+ "\t" + productName);
		 System.out.println("Cost:"+"\t" + Cost);
		 
	 }
	 public static void main(String[] args) {
		 Product p= new Product("iphone",1500000);
		 p.description();
	 }

}
