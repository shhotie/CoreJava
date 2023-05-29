package com.account;

import java.util.Iterator;
import java.util.List;

public class DataPrinter {

	public static void printData(List<? extends Number> list) {
		Iterator<? extends Number> itr = list.iterator();
		System.out.println("****************");
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//itr.remove();
		}
	}
}
