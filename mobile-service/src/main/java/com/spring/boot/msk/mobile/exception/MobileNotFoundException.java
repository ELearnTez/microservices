package com.spring.boot.msk.mobile.exception;

//@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Mobile Not Found")
public class MobileNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3332292346834265371L;

	public MobileNotFoundException(int id){
		super("MobileNotFoundException with id="+id);
	}
}