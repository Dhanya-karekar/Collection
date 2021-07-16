package com.xworkz.collections.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTester {

	public static void main(String[] args) {

		PersonDTO dto1 = new PersonDTO("Rakshitha", 22, "rakshitha3518@gmail.com");
		PersonDTO dto2 = new PersonDTO("Pooja", 23, "pooja@gmail.com");
		PersonDTO dto3 = new PersonDTO("Meghana", 24, "meghana@gmail.com");
		PersonDTO dto4 = new PersonDTO("Dhanya", 23, "dhanya@gmail.com");
		PersonDTO dto5 = new PersonDTO("Sowmya", 24, "sowmya@gmail.com");
		PersonDTO dto6 = new PersonDTO("Anusha", 24, "anusha@gmail.com");

		List<PersonDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		list.add(dto6);
		for (PersonDTO person : list) {
			System.out.println(person);

		}

		System.out.println("****");
		Collections.sort(list);

		for (PersonDTO person : list) {
			System.out.println(person);
		}
	}

}
