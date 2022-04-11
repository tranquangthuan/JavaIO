package com.fsoft.ctc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("D://output.txt", true);
		String message = "Write message tiếng việt\n";
		fout.write(message.getBytes());
		fout.close();
		System.out.println("Write file success");
//		try (OutputStreamWriter osw = new OutputStreamWriter(fout, StandardCharsets.UTF_8)) {
//
//			String text = "Message bằng tiếng việt";
//
//			osw.write(text);
//		}
	}

}
