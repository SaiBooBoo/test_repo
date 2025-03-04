package com.jdc.szm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jdc.szm.trycatch.TryCatchData;

public class CTryCatchTest {
	
	TryCatchData data = new TryCatchData();
	
	@Test
	void testTryWithFinally() {
		String res = data.useCheckedWithTryFinally();
		System.out.println(res);
	}
	
	//@Test
	void testTryMultiCatch() {
		int res = data.useUncheckedWithTryMultiCatch(new int[2], "2");
		assertEquals(res, -1);
		int res1 = data.useUncheckedWithTryMultiCatch(new int[2], "Shit");
		assertEquals(res1, -1);
	}
	
//	@Test
//	void testTryCatch() {
//		String res1 = data.useUncheckedWithTryCatch(127);
//		assertEquals(res1, "ClassCastException");
//	}
}
