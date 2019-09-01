package com.tanuj.exceptions;

public class RolesNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 2305130525843727470L;

	private String exceptionMessage;

	public RolesNotFoundException(int roleId,String exceptionMessage) {
		super();
		this.exceptionMessage = roleId+""+exceptionMessage;
	}

	@Override
	public String getMessage() {
		return exceptionMessage;
	}

	@Override
	public String toString() {
		return exceptionMessage;
	}
}
