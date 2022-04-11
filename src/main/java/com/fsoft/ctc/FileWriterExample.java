package com.fsoft.ctc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileFileWriter = new File("filewriter.txt");

		String newLine = System.getProperty("line.separator");

		try {

			// creating object of FileWriter class with File object as
			// parameter
			FileWriter fileWriter = new FileWriter(fileFileWriter, true);
			fileWriter.write("I love Java");
			fileWriter.append(newLine).append('\u263A').append(newLine);
			fileWriter.write(33);
			fileWriter.write(10);
//			fileWriter.write(10.5);
//			fileWriter.write(true);
			// format() method of String class returns a formatted string
			// using the specified format string and arguments
			fileWriter.append(String.format("My name is %s", "Awesome!"));

			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
