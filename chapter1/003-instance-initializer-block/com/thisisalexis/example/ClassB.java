package com.thisisalexis.example;

public class ClassB {

	{ System.out.println("Instance initializer from parent class (ClassB)"); }

	public ClassB() {
		System.out.println("This is the parent constructor (ClassB)");
	}	
}