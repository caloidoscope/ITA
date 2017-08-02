package com.oocl.ita.inheritance.override;

public class InherittedClass extends BaseClass{
	
	public static void main (String args[]) {
		InherittedClass ic = new InherittedClass();
		//Upcasting inheritted class to base class
		BaseClass bc = (BaseClass) ic;
		bc.secondMethod();
		
		//Resetting to original casting
		bc = new BaseClass();
		bc.secondMethod();
	}
	
	@Override
	public void secondMethod(){
		System.out.println("I'm from the overrided method");
	}
	
	
}
