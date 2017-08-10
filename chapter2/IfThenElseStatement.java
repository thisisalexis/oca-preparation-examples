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

	}
}