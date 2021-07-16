package com.xworkz.collections.product;

import java.io.Serializable;

public class ProductDTO implements Serializable, Comparable<ProductDTO> {

	private String name;
	private String brand;
	private double price;
	private int quantity;

	public ProductDTO() {
		System.out.println("default");
	}

	public ProductDTO(String name, String brand, double price, int quantity) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}

	@Override
	public int compareTo(ProductDTO other) {
		double priceOfOther = other.getPrice();
		if (this.price == priceOfOther)
			return 0;
		if (this.price < priceOfOther)
			return -1;
		if (this.price > priceOfOther)
			return 1;
		return 0;

	}

}
