package com.jdc.szm.trycatchWithThrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class TryCatchWithThrowData {
	
	
	public void useMessage() {
		try {
			String message = getData();
			System.out.println(message);
		}
		
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
		catch(NoSuchElementException e) {
			System.err.println(e.getMessage());
		}
	}

	//when create check type, type must be thrown
	//when create uncheck type, it's all up to you
	//when you used throws, it must be the same level type or super type
	@SuppressWarnings("unused")
	private String checkMessage(String message) {
		if(message.isBlank()){
			throw new NullPointerException("There is no message");
			}
		return message;
	}
	
	
	private String getData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type your message:");
		return br.readLine();
	}
}