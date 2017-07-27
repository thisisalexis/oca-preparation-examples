package com.thisisalexis.example;

public class ClassA extends ClassB {
	
	{ someField = "Inicialized in instance initialization block!"; }
	String someField = "Initialized in atribute instance";
	
	
	{
		System.out.println("First instance initializer");
	}

	{
		System.out.println("Second instance initializer");
	}

	public ClassA() {
		System.out.println("ClassA Constructor");
	}

	public static void main(String... args) {
		ClassA a = new ClassA();
		System.out.println("*** The value of someField variable is: " + a.someField + "***" );
	}
}