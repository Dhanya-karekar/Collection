package com.xworkz.collections.icecream;

import java.io.*;
import java.lang.*;
import java.util.*;

public class IceCreamDTO implements Serializable {

    String brand;
    int price;
	private String flavour;
	private double quantity;

	public IceCreamDTO() {
		System.out.println("default");
	}

	public IceCreamDTO(String brand, int price, String flavour, double quantity) {
		super();
		this.brand = brand;
		this.price = price;
		this.flavour = flavour;
		this.quantity = quantity;
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

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "IceCreamDTO [brand=" + brand + ", price=" + price + ", flavour=" + flavour + ", quantity=" + quantity
				+ "]";
	}

}
