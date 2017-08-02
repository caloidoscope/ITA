package com.oocl.ita.inheritance.override;

public class BaseClass {
	public void firstMethod() {
		secondMethod();
	}
	
	public void secondMethod() {
		System.out.println("I'm from the original method");
	}

}
