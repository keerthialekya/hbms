package com.cg.hbm.exceptions;

/**
 * 
 * @author keerthi
 *
 */
public class BookingDetailsNotFoundException extends Exception {
private static final long serialVersionUID = 1L;

private String errorMessage;
/**
 * 
 * @param errorMessage
 */

public BookingDetailsNotFoundException(String errorMessage) {
	super(errorMessage);
	this.errorMessage = errorMessage;
}

public BookingDetailsNotFoundException() {
	super();
}
/**
 * 
 * @return String
 */
public String getErrorMessage() {
	return errorMessage;
}



	
	
	

}
