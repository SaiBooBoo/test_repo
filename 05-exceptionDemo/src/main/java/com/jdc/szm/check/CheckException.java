package com.jdc.szm.check;

import java.io.File;
import java.io.IOException;

public class CheckException {
	
	public String createFile(String dir) {
		try {
			File file = new File(dir+"test.txt");
			file.createNewFile();
			return file.exists() ? "exit": "empty";
		} 
		
		catch (IOException e) {
			return "IOException";
		}
	}
}
