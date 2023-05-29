package com.petshop;

import java.io.Serializable;

public class Pet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2333618584827373324L;
	public static int PET_ID = 0;
	private Integer petId = PET_ID;
	private String name;
	private Category category;
	private double unitPrice;
	private int stocks;
	
	public Pet(String name, Category category, double unitPrice, int stocks) {
		super();
		PET_ID++;
		this.petId = PET_ID; 
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}

	public static int getPET_ID() {
		return PET_ID;
	}

	public static void setPET_ID(int pET_ID) {
		PET_ID = pET_ID;
	}

	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getStocks() {
		return stocks;
	}

	public void setStocks(int stocks) {
		this.stocks = stocks;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", stocks=" + stocks + "]\n";
	}
	
	
	
}
