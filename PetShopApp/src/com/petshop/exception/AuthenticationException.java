package com.petshop.exception;

public class AuthenticationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AuthenticationException(String msg) {
		super(msg);
	}
}
