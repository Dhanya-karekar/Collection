package com.xworkz.collections.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductTester {

	public static void main(String[] args) {

		ProductDTO dto1 = new ProductDTO("Monaco", "Parle", 50, 15);
		ProductDTO dto2 = new ProductDTO("Parle G", "Parle", 20, 20);
		ProductDTO dto3 = new ProductDTO("Treat", "Britannia", 30, 40);
		ProductDTO dto4 = new ProductDTO("50-50", "Krackjack", 10, 15);
		ProductDTO dto5 = new ProductDTO("Sunfeast", "Dark Fantasy", 40, 20);
		ProductDTO dto6 = new ProductDTO("Unibic", "Cookies", 60, 15);

		List<ProductDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		list.add(dto6);
		for (ProductDTO product : list) {
			System.out.println(product);

		}

		System.out.println("****");
		Collections.sort(list);

		for (ProductDTO product : list) {
			System.out.println(product);
		}
	}
}
