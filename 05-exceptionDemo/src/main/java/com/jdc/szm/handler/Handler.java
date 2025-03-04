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
		try {
			person.setAge(20);
			System.out.println(person.getAge());
		} catch (ArithmeticException e) {
			System.out.println("This is ArithmeticException because number cannot divided by zero");

		}

	}

	// ArithmeticException
	@SuppressWarnings("unused")
	private int dividedByZero(int age) {
		return age / 0;
	}

	// StackOverflowError
	public void recursive() {
		try {
			if (person.getAge() > 0) {
				recursive();
			}
		} catch (StackOverflowError e) {
			System.out.println("This is StackOverflowError because it is recursive");
		}

	}
}
