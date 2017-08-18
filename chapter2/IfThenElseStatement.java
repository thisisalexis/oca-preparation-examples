class IfThenElseStatement {
	
	/*
		Notice that you can mix 
	*/
	public static void main(String[] args) {
		int hourOfDay =20;

		if(hourOfDay > 15)
			System.out.println("Good Afternoon");
		else if( hourOfDay > 11 ) {
			System.out.println("Good Morning"); //UNREACHEABLE CODE... But the compiler can't notice about it and it still compiles
		} else 
			System.out.println("Good Evening");

		//Call another example
		IfThenElseStatement.trickyMethod();
		IfThenElseStatement.trickyMethodTwo();
	}

	//Anocher very important example
	public static void trickyMethod() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> \nEjemplo dos: trickyMethod.");
		
		boolean result = true;
		
		if(result = false) //ESTO SI HACE LA ASIGNACION!!!! Convierne result a false y la expresión devuelve false, por lo que entra en el else
			System.out.println("Result sigue siendo true: " + result);
		else
			System.out.println("Result ahora es false: " + result);
	}

	//Este ejemplo es un complemento de trickyMethod()
	public static void trickyMethodTwo() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> \nEjemplo dos: trickyMethod.");
		
		int result = 0;
		
		if(result = 1) ///ERRORRRRRR...No compila, porque la asignación devuelve un entero y no un booleano
			System.out.println(result);
		else
			System.out.println(result);
	}
}