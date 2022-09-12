package com.fsoft.ctc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter writer = new PrintWriter(System.out);
		writer.write("Abc.com.Vn");
		// System.out.print(true);
		writer.print(true);
		writer.flush();
		writer.close();
		// Dữ liệu được ghi vào File sử dụng PrintWriter
		PrintWriter writer1 = null;
		writer1 = new PrintWriter(new File("D:\\testout.txt"));
		writer1.write("Java, Spring, Hibernate, Android, PHP, ...");
		writer1.flush();
		writer1.close();
	}

}
