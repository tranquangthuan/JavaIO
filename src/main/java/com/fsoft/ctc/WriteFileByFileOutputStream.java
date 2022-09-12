package com.fsoft.ctc;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileByFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("D://JavaIO//WriteFileByFileOutputStream.txt", true);
		String msg = "Message from java code\n";
		fos.write(msg.getBytes());
		System.out.println("Write file success");
		fos.close();
	}

}
