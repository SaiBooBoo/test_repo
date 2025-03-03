package com.jdc.szm.handler;

public class Handler {

	private Person person;
	
	public Handler() {
		super();
		person = new Person();
	}
	
	public void useName() {
		try {
			person.setName("John Doe");
			System.out.println(person.getName());
		} catch (NullPointerException e) {
			System.out.println("This is NullPointerException because there is no perosn object");
		}
		
	}
	
	public void useAge() {
		person.setAge(20);
		System.out.println(person.getAge());
	}

	
	private int dividedByZero(int age) {
		return age/0 ;
	}
	
	public void recursive() {
		if(person.getAge() > 0) {
			recursive();
		}
	}
}
