package com.fsoft.ctc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader;
		BufferedReader br = null;
		try {
			reader = new FileReader("D://JavaIO//bufferreader.txt");
			br = new BufferedReader(reader);

			// read line by line
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
