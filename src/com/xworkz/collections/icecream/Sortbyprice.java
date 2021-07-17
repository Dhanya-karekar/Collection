package com.xworkz.collections.icecream;

import java.util.Comparator;

public class Sortbyprice implements Comparator<IceCreamDTO> {

	public int compare(IceCreamDTO a, IceCreamDTO b) {

		return a.price - b.price;
	}

}
