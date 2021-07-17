package com.xworkz.collections.alcohols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlcoholTester {

	public static void main(String[] args) {

		AlcoholDTO dto1 = new AlcoholDTO("Jack Daniels", 3500, 180, true);
		AlcoholDTO dto2 = new AlcoholDTO("Jonny Walker", 1000, 160, false);
		AlcoholDTO dto3 = new AlcoholDTO("Chivas-S", 2000, 90, false);
		AlcoholDTO dto4 = new AlcoholDTO("Black Dog", 2500, 120, true);
		AlcoholDTO dto5 = new AlcoholDTO("Blender's Pride", 1999, 30, true);
		AlcoholDTO dto6 = new AlcoholDTO("Teacher's", 2999, 60, true);

		List<AlcoholDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		list.add(dto6);

		for (AlcoholDTO alcohol : list) {
			System.out.println(alcohol);

		}

		System.out.println("****");
		Collections.sort(list);

		for (AlcoholDTO alcohol : list) {
			System.out.println(alcohol);
		}
	}

}
