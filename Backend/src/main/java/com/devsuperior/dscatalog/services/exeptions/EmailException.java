package com.devsuperior.dscatalog.services.exeptions;


@SuppressWarnings("serial")
public class EmailException extends RuntimeException {

	public EmailException(String msg) {
		super(msg);
	}
}