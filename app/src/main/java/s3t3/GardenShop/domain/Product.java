package s3t3.GardenShop.domain;

import java.util.concurrent.atomic.AtomicInteger;

abstract class Product {
	
	private int id; 
	private double price;
	private String name;
	private static AtomicInteger ai = new AtomicInteger(0);
	
	public Product(double price, String name) {
		this.price = price;
		this.name = name;
		this.id = ai.incrementAndGet();
	}
	
	//getters & setters
	public int getId() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}