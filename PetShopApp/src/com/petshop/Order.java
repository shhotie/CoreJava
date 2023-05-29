package com.petshop;

public class Order {

	public static int ORDER_ID= 0;
	private int orderId = ORDER_ID;
	private Integer petId;
	private int quantity;
	private Status status;
	public Order(int petId, int quantity, Status status) {
		super();
		ORDER_ID++;
		this.orderId = ORDER_ID;
		this.petId = petId;
		this.quantity = quantity;
		this.status = status;
	}
	public static int getORDER_ID() {
		return ORDER_ID;
	}
	public static void setORDER_ID(int oRDER_ID) {
		ORDER_ID = oRDER_ID;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status + "]\n";
	}
	
	
}
