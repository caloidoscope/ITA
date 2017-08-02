package com.oocl.ita.termination;

public class TankOperations {
//	EXERCISE 6
//	Create a class called Tank that can be filled and emptied, 
//	with a termination condition that it must be empty when the object is cleaned up. 
//	Write a finalize () that verifies this termination condition. In main (), 
//	test the possible scenarios that can occur when you use Tank.
	public static void main (String args[]) throws Throwable {
		Tank tank = new Tank();
		tank.checkStatus();
		tank.cleanTank();
		tank.checkStatus();
		tank.emptyTank();
		tank.checkStatus();
		tank.cleanTank();
		tank.checkStatus();
		tank.cleanTank();
		tank = null;
		System.gc();
	}
}
