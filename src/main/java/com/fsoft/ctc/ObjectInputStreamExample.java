package com.fsoft.ctc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("D://JavaIO//objectOutStream.txt"));
			// read student
			Student student = (Student) ois.readObject();
			// show student
			System.out.println(student);
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			ois.close();
		}
	}

}
