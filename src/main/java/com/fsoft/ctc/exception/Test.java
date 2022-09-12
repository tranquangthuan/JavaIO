package com.fsoft.ctc.exception;

public class Test {
	public static void main(String[] args) {
//		try {
//			int a[] = new int[5];
//			a[5] = 30 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println("common task completed");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("task1 is completed");
//		} catch (Exception  e) {
//			System.out.println("task2 is completed");
//		}
//		System.out.println("rest of the code...");

//		try {
//			int data = 25 / 5;
//			System.out.println(data);
//		} catch (NullPointerException e) {
//			System.out.println(e);
//		} finally {
//			System.out.println("finally block is always executed");
//		}
//		System.out.println("rest of the code...");

		// Catch tu Chi tiet den chung nhat, Loi compiler
//		try {
//            int a[] = new int[5];
//            a[5] = 30 / 0;
//        } catch (Exception e) {
//            System.out.println("common task completed");
//        } catch (ArithmeticException e) {
//            System.out.println("task1 is completed");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("task2 is completed");
//        }
//        System.out.println("rest of the code...");

//		try {
//			int data = 25 / 0;
//			System.out.println(data);
//		} catch (NullPointerException e) {
//			System.out.println(e);
//		} finally {
//			System.out.println("finally block is always executed");
//		}
//		System.out.println("rest of the code...");

		// System.out.println(testFinalMethod());
	}

	@SuppressWarnings("finally")
	private static boolean testFinalMethod() {
		try {
			int data = 2;
			if (data % 2 != 0) {
				System.out.println(data + " is odd number");
				return true;
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
			// return false;
		}
		System.out.println("rest of the code...");
		return false;
	}
}
