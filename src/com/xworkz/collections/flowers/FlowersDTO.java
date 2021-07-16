package com.xworkz.collections.flowers;

import java.util.*;

public class FlowersDTO {

	public static void main(String[] args) {

		List<String> flower = new ArrayList<String>();

		// 1 adding elements to the list

		flower.add("Rose");
		flower.add("Lily");
		flower.add("Daisy");
		flower.add("Dahlia");
		flower.add("Daffodil");
		flower.add("Jasmine");
		flower.add("Marigold");
		flower.add("Iris");
		flower.add("Orchid");
		flower.add("Aster");
		flower.add("Tulip");
		flower.add("Chrysanthemum");

		System.out.println("Total number of flowers in list: " + flower.size());

		// Iterating the List element using for-each loop
		for (String flowers : flower)
			System.out.println(flowers);

		// 2 get & set methods for list

		System.out.println("Flower to get is: " + flower.get(1));
		// get by index number
		flower.set(6, "Azalea");
		// set by index number and value to be replaced
		for (String flowers : flower)
			System.out.println(flowers);

		// 3 index of

		int indexOfLily = flower.indexOf("Lily");
		System.out.println("Index of Lily is:" + indexOfLily);

		// 4 last index of

		int lastIndexOf = flower.lastIndexOf("Rose");
		System.out.println("Last index of Rose: " + lastIndexOf);

		// 5 contains

		boolean OrchidThere = flower.contains("Orchid");
		System.out.println("Is Orchid flower in list? " + OrchidThere);

		// 6 remove

		boolean removeMarigold = flower.remove("Marigold");
		System.out.println("Removing Marigold from list: " + removeMarigold);
		for (String flowers : flower)
			System.out.println(flowers);

		List<String> moreFlowers = new ArrayList<String>();

		moreFlowers.add("Peony");
		moreFlowers.add("Hyacinth");
		moreFlowers.add("Lavender");
		moreFlowers.add("Amaryllis");
		moreFlowers.add("Lilac");
		moreFlowers.add("Sunflower");
		moreFlowers.add("Zinnia");
		moreFlowers.add("Voilet");
		moreFlowers.add("Carnation");
		moreFlowers.add("Lotus");

		// 7 add all

		boolean addAll = flower.addAll(11, moreFlowers);
		System.out.println("Using Add all method: " + addAll);

		for (String flowers : flower)
			System.out.println(flowers);

		/*
		 * 8 remove all
		 *
		 * boolean removeAll = flower.removeAll(moreFlowers);
		 * System.out.println(removeAll);
		 */

		// 9 contains all

		boolean containsAll = flower.containsAll(moreFlowers);
		System.out.println("Checking contains all: " + containsAll);

		// sorting

		Collections.sort(flower);
		System.out.println("Below data is sorted");

		for (String flowers : flower)
			System.out.println(flowers);

	    // retain all = check common things in both

		// iterator

		ListIterator<String> itr = flower.listIterator(21);

		System.out.println(" ITR Index " + itr.nextIndex());

		while (itr.hasPrevious()) {
			String e = itr.previous();
			System.out.println(e);
		}
		System.out.println("***********");

		while (itr.hasNext()) {
			String string = itr.next();
			System.out.println(string);
		}
		System.out.println(flower.size());
	}
}
