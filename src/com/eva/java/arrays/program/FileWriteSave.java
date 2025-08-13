package com.eva.java.arrays.program;

import java.io.*;

public class FileWriteSave {
	public static void main(String[] args) {
		// giving the file location
		String filePath = "C:\\Users\\91933\\OneDrive\\Desktop\\demophage.pdf";

		try {
			// creating new file
			File file = new File(filePath);
			if (file.createNewFile()) {
				System.out.println("File Created :- " + filePath);
			} else {
				System.out.println("File does not exist not not created");
			}
			// writing soming in the file
			FileWriter write = new FileWriter(file);
			write.write("Hello! This message is written by automcation using java and selenium \nAutomation is fun!");
			write.close();

		} catch (Exception e) {
			e.getMessage();
		}

	}
}
