package com.xworkz.collections.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class Actor {

	public static void main(String[] args) {

		// group of data

		String actor1 = "Rock";
		String actor2 = "Angelina jolie";
		String actor3 = "Margot robbie";
		String actor4 = "Emma watson";
		String actor5 = "Gal gadot";
		String actor6 = "Alexandra daddario";
		String actor7 = "Kristen stewart";
		String actor8 = "Selena gomez";
		String actor9 = "Scarlett johnson";
		String actor10 = "Jennifer lawrence";

		Collection collection = new ArrayList();

		boolean added = false;
		added = collection.add(actor1);
		added = collection.add(actor2);
		added = collection.add(actor3);
		added = collection.add(actor4);
		added = collection.add(actor5);
		added = collection.add(actor6);
		added = collection.add(actor7);
		added = collection.add(actor8);
		added = collection.add(actor9);
		added = collection.add(actor10);
		added = collection.add("Natalie portman");
		System.out.println(added);

		int total = collection.size();
		System.out.println(total);

		// collection.clear();

		System.out.println(collection.size());

		String check = "Natalie portman";
		boolean contain = collection.contains(check);
		System.out.println("contain: " + contain);

		boolean removed = collection.remove("Jennifer aniston");
		System.out.println(removed);

		Iterator iterator = collection.iterator(); // impl Iterator

		iterator.hasNext();
		Object object = iterator.next();
		System.out.println(object);

		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		Object secret = iterator.next();
		System.out.println("Secret: " + secret);
	}

}
