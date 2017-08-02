package com.oocl.ita.inheritance.rodent;

public class Rodents {

	public static void main(String[] args) {
//		EXERCISE 3
//		Create an inheritance hierarchy of Rodents: Mouse, Gerbil, Hamster, etc. 
//		In the base class, provide methods that are common to all Rodents, 
//		and override these in the derived classes to perform different behaviors 
//		depending on the specific type of Rodent. 
//		Create an array of Rodent, fill it with different specific types of Rodents, 
//		and call your base-class methods to see what happens.
		
//		Declaring array of rodent objects 
		Rodent[] rodents = {new Mickey(), new SpeedyGonzales(), new StuartLittle()};
		for (Rodent rodent : rodents){
			rodent.sayDialog();
		}
	}
}
