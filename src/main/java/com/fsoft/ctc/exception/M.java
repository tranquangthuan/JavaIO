package com.fsoft.ctc.exception;

import java.io.IOException;

public class M {
	void method() throws IOException {
		System.out.println("abc");
		throw new IOException("Loi thiet bi");
	}
}
