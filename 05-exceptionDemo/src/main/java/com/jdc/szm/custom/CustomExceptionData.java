package com.jdc.szm.custom;

public class CustomExceptionData {

	public String changeCheckToUncheck(String message) {
		try {
		String mes = getMyCheckException(message);
		System.out.println(mes);
	} catch (MyCheckException e) {
		throw new MyUnCheckException(e.getMessage());
	}
		return message;
	}
	
	public String getMyCheckException(String message) throws MyCheckException {
		if(null == message || message.isBlank()) {
			throw new MyCheckException("There is no message yet !");
		}
		return message;
	}
	
	public String getMyUnCheckException(String message) {
		if(message.isBlank()) {
			throw new MyUnCheckException("There is no message yet for uncheck !");
		}
		return message;
	}
}
