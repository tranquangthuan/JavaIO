package com.fsoft.ctc.exception;

import java.io.IOException;

public class M {
	void method() throws IOException {
		System.out.println("IOException");
		throw new IOException("Loi thiet bi");
	}

	void method2() throws RuntimeException {
		System.out.println("RuntimeException");
		throw new RuntimeException("Loi thiet bi");
	}
}
