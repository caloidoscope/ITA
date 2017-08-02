package com.oocl.ita.fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
//		EXERCISE 4
//		Write a Java program to print Fibonacci series (eg: 1, 1, 2, 3, 5…) up to 100.
		
		long a = 0, b = 1;
		for (long i = 0; i < 100; i++) {
			long c = a + b;
			a = b;
			b = c;
			System.out.print(a + " ");
		}
	}

}
