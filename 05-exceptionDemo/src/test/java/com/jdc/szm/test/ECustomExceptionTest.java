package com.jdc.szm.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.szm.custom.CustomExceptionData;
import com.jdc.szm.custom.MyCheckException;
import com.jdc.szm.custom.MyUnCheckException;

public class ECustomExceptionTest {
	static CustomExceptionData data;
	
	@BeforeAll
	static void inti() {
		data = new CustomExceptionData();
	}
	
	@Test
	void test() {
		
		assertThrows(MyUnCheckException.class, () -> data.getMyUnCheckException(""));
		assertThrows(MyUnCheckException.class, () -> data.changeCheckToUncheck(null));
		assertThrows(MyCheckException.class, () -> data.getMyCheckException(" "));


		
	}
}
