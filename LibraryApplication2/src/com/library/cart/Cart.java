package com.library.cart;

public class Cart {

	public static int ORDER_ID=0;
	private int orderId = ORDER_ID;
	private String title;
	private int quantity;
	private Status status;
	public Cart(String title, int quantity, Status status) {
		super();
		this.orderId = ORDER_ID;
		this.title = title;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
		return "Cart [orderId=" + orderId + ", title=" + title + ", quantity=" + quantity + ", status=" + status + "]\n";
	}
	
	
	
}
