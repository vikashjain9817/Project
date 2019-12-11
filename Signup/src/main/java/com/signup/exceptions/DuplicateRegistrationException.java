package com.signup.exceptions;

public class DuplicateRegistrationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateRegistrationException(String msg) {
		super(msg);
	}
}
