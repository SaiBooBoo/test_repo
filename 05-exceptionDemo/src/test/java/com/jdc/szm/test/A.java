package com.jdc.szm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jdc.szm.check.CheckException;

public class A {

	CheckException data = new CheckException();
	@Test
	void fileTest() {
		String res = data.createFile("");
		assertEquals(res, "exit");
		
		String res1 = data.createFile("D:/data/");
		assertEquals(res1, "IOException");
	}
}
