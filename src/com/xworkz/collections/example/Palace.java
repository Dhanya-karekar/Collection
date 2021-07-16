package com.xworkz.collections.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class Palace {

	public static void main(String[] args) {

		// group of data

		String palace1 = "City palace";
		String palace2 = "Cooch Behar palace";
		String palace3 = "Umaid bhavan palace";
		String palace4 = "Taj lake palace";
		String palace5 = "Amber palace";
		String palace6 = "Banglore palace";
		String palace7 = "Rambagh palace";
		String palace8 = "Marble palace";
		String palace9 = "Kowdiar palace";
		String palace10 = "Ujjyanta palace";

		Collection collection = new ArrayList();

		boolean added = false;
		added = collection.add(palace1);
		added = collection.add(palace2);
		added = collection.add(palace3);
		added = collection.add(palace4);
		added = collection.add(palace5);
		added = collection.add(palace6);
		added = collection.add(palace7);
		added = collection.add(palace8);
		added = collection.add(palace9);
		added = collection.add(palace10);
		added = collection.add("Jaganmohan Palace");
		System.out.println(added);

		int total = collection.size();
		System.out.println(total);

		// collection.clear();

		System.out.println(collection.size());

		String check = "Taj lake Palace";
		boolean contain = collection.contains(check);
		System.out.println("contain: " + contain);

		boolean removed = collection.remove("Chowmahalla palace");
		System.out.println(removed);

		Iterator iterator = collection.iterator(); // impl Iterator

		iterator.hasNext();
		Object object = iterator.next();
		System.out.println(object);

		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		Object secret = iterator.next();
		System.out.println("Secret: " + secret);
	}

}
