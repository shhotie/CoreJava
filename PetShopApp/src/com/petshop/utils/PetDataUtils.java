package com.petshop.utils;

import java.util.ArrayList;
import java.util.List;

import com.petshop.Category;
import com.petshop.Pet;

public class PetDataUtils {

	public static List<Pet> getPetData() {
		List<Pet> petList = new ArrayList<>();
		Pet p = new Pet("Bull Dog", Category.DOG, 1000.00, 50);
		petList.add(p);
		p = new Pet("Persian Cat", Category.CAT, 1500.00, 50);
		petList.add(p);
		p = new Pet("White Rabbit", Category.RABBIT, 500.00, 50);
		petList.add(p);
		p = new Pet("Golden Fish ", Category.FISH, 300.00, 50);
		petList.add(p);
		p = new Pet("White Dog", Category.DOG, 2000.00, 50);
		petList.add(p);
		return petList;
	}
}
