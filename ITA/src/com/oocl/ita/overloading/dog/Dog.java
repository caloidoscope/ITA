package com.oocl.ita.overloading.dog;

public class Dog {
	
//	EXERCISE 5
//	Create a class called Dog with an overloaded bark () method. 
//	Your method should be overloaded based on various primitive data types, 
//	and should print different types of barking, howling, etc., 
//	depending on which overloaded version is called. 
//	Write a main () that calls all the different versions.

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.bark());
		System.out.println(dog.bark(3));
		System.out.println(dog.bark(3,false));
	}
	
	public String bark() {
		return "Wooooooof! ";
	}
	
	public String bark(int count) {
		String result = "";
		for (int i = 0; i < count; i++) {
			result += bark();
		}
		return result;
	}
	
	public String bark(int count, boolean isBark) {
		String result = "";
		if (isBark) {
			bark(count);
			return bark(count);
		}
		for (int i = 0; i < count; i++) {
			result += "Awooooooo! ";
		}
		return result;
	}
}
