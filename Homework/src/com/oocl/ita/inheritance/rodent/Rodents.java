package com.oocl.ita.inheritance.rodent;

public class Rodents {

	public static void main(String[] args) {
//		Declaring array of rodent objects 
		Rodent[] rodents = {new Mickey(), new SpeedyGonzales(), new StuartLittle()};
		for (Rodent rodent : rodents){
			rodent.sayDialog();
		}
	}

}
