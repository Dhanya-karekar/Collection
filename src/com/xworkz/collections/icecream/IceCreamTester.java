package com.xworkz.collections.icecream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collections.alcohols.AlcoholDTO;

public class IceCreamTester {

	public static void main(String[] args) {

		IceCreamDTO dto1 = new IceCreamDTO("Naturals", 400, "Black current", 100);
		IceCreamDTO dto2 = new IceCreamDTO("Polar Bear", 500, "Blue Berry", 150);
		IceCreamDTO dto3 = new IceCreamDTO("Baskin Robbins", 200, "White Forest", 100);
		IceCreamDTO dto4 = new IceCreamDTO("Magnum", 400, "Chocolate", 250);
		IceCreamDTO dto5 = new IceCreamDTO("Amul", 150, "Strawberry", 100);
		IceCreamDTO dto6 = new IceCreamDTO("Ben & Jerry's", 400, "Black current", 100);

		List<IceCreamDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		list.add(dto6);

		System.out.println("Unsorted");
		for (IceCreamDTO iceCreamDTO : list) {
			System.out.println(iceCreamDTO);
		}

		Collections.sort(list, new Sortbybrand());

		System.out.println("Sort by Brand");
		for (IceCreamDTO iceCreamDTO : list) {
			System.out.println(iceCreamDTO);
		}

		Collections.sort(list, new Sortbyprice());

		System.out.println("Sort by Price");
		for (IceCreamDTO iceCreamDTO : list) {
			System.out.println(iceCreamDTO);
		}

	}

}
