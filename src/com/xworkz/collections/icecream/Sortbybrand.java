package com.xworkz.collections.icecream;

import java.util.Comparator;

public class Sortbybrand implements Comparator<IceCreamDTO>{
	
	public int compare(IceCreamDTO a, IceCreamDTO b) {
		
		return a.brand.compareTo(b.brand);
	}

}
