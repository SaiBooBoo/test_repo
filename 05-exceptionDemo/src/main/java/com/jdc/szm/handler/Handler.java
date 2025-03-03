package com.jdc.szm.handler;

public class Handler {

	private Person person;
	
	void useMessage() {
		person.setName("John Doe");
		System.out.println(person.getName());
	}
}
