package com.oocl.ita.inheritance.cycle;

public class Cycle {
	public void ride() {
		System.out.println("Angkas na pare!");
	}

	public static void main(String[] args) {
		
//		EXERCISE 1
//		Create a Cycle class, with subclasses Unicycle, Bicycle, and Tricycle. 
//		Demonstrate that an instance of each type can be upcast to Cycle via a ride () method.
		
		Unicycle uni 		= new Unicycle();
		Bicycle bike 		= new Bicycle();
		Tricycle trike 		= new Tricycle();
		
//		Upcasting
		Cycle uniUp 		= (Cycle) new Unicycle();
		Cycle bikeUp 		= (Cycle) new Bicycle();
		Cycle trikeUp 		= (Cycle) new Tricycle();
		
		uni.ride();
		bike.ride();
		trike.ride();

		
//		EXERCISE 2
//		Using the Cycle hierarchy from Exercise 1, 
//		Add a balance () method to Unicycle and Bicycle but not to Tricycle. 
//		Upcast instances of all three types to an array of Cycle. 
//		Try to call balance () on each element of the array and observe the results. 
//		Downcast and call balance () and observe what happens.
		
//		Downcasting
		Unicycle uniDown 	= (Unicycle) uniUp;
		Bicycle bikeDown 	= (Bicycle) bikeUp;
		Tricycle trikeDown 	= (Tricycle) trikeUp;
		
		uniDown.balance();
		bikeDown.balance();
		trikeDown.balance();
		
	}

}
