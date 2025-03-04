package com.jdc.szm.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.szm.trycatchWithThrow.TryCatchWithThrowData;

public class DTryCatchWithThrowTest {
	
	private static TryCatchWithThrowData data;
	
	@BeforeAll
	static void inint() {
		data = new TryCatchWithThrowData();
	}
	
	@Test
	void testGetMessage() {
		data.useMessage();
	}
}
