package com.fsoft.ctc;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileByFileInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fin = new FileInputStream("D://Data.txt");
		System.out.println("Number of remaining bytes:" + fin.available());
		//fin.skip(5);
		System.out.println("File content");
		int ch;
		while ((ch = fin.read()) != -1) {
			System.out.print((char) ch);
		}
		fin.close();

	}

}
