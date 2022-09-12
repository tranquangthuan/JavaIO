package com.fsoft.ctc;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File filePrintWriter = new File("D://JavaIO//printwriter.txt");

		try {
			// creating object of PrintWriter class with File object
			// as parameter
			PrintWriter printWriter = new PrintWriter(filePrintWriter);
			// using methods and close write inherrited from parent
			// Writer
			printWriter.write("I love Java");
			// method to terminate the current line by writing the
			// line separator string
			printWriter.println();
			printWriter.println();
			// ASCII
			printWriter.write(65);
			printWriter.println();
			printWriter.println(10.5);
			printWriter.println(true);

			// method to write a formatted string to this writer
			// using the specified format string and arguments
			printWriter.printf("My name is %s", "Awesome!");

			/*
			 * Closes the stream and releases any system resources associated with it. It
			 * needs to be done to flush buffer
			 */

			printWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
