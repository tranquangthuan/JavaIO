package com.fsoft.ctc.exception;

import java.io.IOException;

public class MMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M m = new M();
		try {
			m.method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("after exception");

		// m.method2();
	}

}
