package com.xworkz.collections.alcohols;

import java.io.Serializable;

public class AlcoholDTO implements Serializable, Comparable<AlcoholDTO> {

	private String brand;
	private double price;
	private double quantity;
	private boolean isItScotch;

	public AlcoholDTO() {
		System.out.println("default");

	}

	public AlcoholDTO(String brand, double price, double quantity, boolean isItScotch) {
		super();
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.isItScotch = isItScotch;
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public boolean getIsItScotch() {
		return isItScotch;
	}

	public void setItScotch(boolean isItScotch) {
		this.isItScotch = isItScotch;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [brand=" + brand + ", price=" + price + ", quantity=" + quantity + ", isItScotch="
				+ isItScotch + "]";
	}

	@Override
	public int compareTo(AlcoholDTO other) {
		return (this.getBrand().compareTo(other.getBrand()));
	}

}
