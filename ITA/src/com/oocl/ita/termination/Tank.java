package com.oocl.ita.termination;

public class Tank {
	
	boolean filled = true;
	boolean clean = false;
	
	public void cleanTank() {
		System.out.println("Action: Clean");
		if (clean) {
			System.out.println("Failed. Tank is already clean!\n");
			return;
		}
		if (filled) {
			System.out.println ("Failed. Tank is filled!\n");
			return;
		}
		this.clean = true;
		System.out.println("Success. Tank is cleaned!\n");
	}
	
	public void emptyTank() {
		System.out.println("Action: Empty");
		this.filled = false;
		System.out.println("Success. Tank is emptied!\n");
	}
	
	public void fillTank() {
		System.out.println("Action: Fill");
		this.filled = true;
		System.out.println("Success. Tank is filled!\n");
	}   
	
	public void checkStatus() {
		System.out.println("Current Status: " + (this.filled ? "Filled" : "Empty") + " and " + (this.clean ? "Clean" : "Dirty"));
	}
	
	public void finalize() {
		if (clean) {
			System.out.println("Now exitting");
			System.exit(0);
		}
		else {
			System.out.println("Not clean");
		}
	}
}
