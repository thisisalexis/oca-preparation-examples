public class SwitchStatement {
	public static void main(String... args) {
		SwitchStatement.ExampleOne();		//Example One
		SwitchStatement.ExampleTwo();		//Example two
		SwitchStatement.ExampleThree();		//Example Three
	}

	/*
	Este ejemplo resulta en Weekday.
	*/
	public static void ExampleOne() { 
		int dayOfWeek = 5;

		switch(dayOfWeek) {
			default: 
					System.out.println("Weekday");//TODAS LAS LINEAS SE EJECUTAN
					System.out.println("Another line in the same case");
					System.out.println("Another line in the same case");
					System.out.println("Another line in the same case");
					System.out.println("Another line in the same case");
					System.out.println("Another line in the same case");
					break;
			case 0:
				{	//También se ejecutan todas las sentencias, pero esta vez utiliza llaves {}
					System.out.println("Sunday");
					System.out.println("Sunday");
					System.out.println("Sunday");
					System.out.println("Sunday");
					break;
				}
			case 6: 
				System.out.println("Saturday");
				break;
		}

	}

	public static void ExampleTwo() {//Prints out Weekday saturday (WTF?)
		int dayOfWeek = 6;

		switch(dayOfWeek) {
			case 56:
				System.out.println("Sunday");
			default: 
				System.out.println("Weekday");
			case 6: 
				System.out.println("Saturday");
				//break;
			case 10:
				System.out.println("Ah verga pa loca, chiamo!");
		}
	}	


	//Example Three
	public static void ExampleThree() {
		int someNumber = 5;
		final short compare = 5;
		final byte compare2 = 25;
		final char compare3 = 'a';
		final Byte compare4 = new Byte((byte) 7);
		final int compare5 = 5;


		switch(someNumber) {
			case compare:
				System.out.println("5");
				break;
			case compare2:
				System.out.println("25");
				break;
			case compare3:
				System.out.println("un char");		//Si compila y funciona
				break;
			case compare4:							//Esto no compila y no sé por qué :(
				System.out.println("un Byte");
				break;
			case compare5:							//tambien vale 5, pero en otra variable y tipo de dato... no compila, dice que el label está duplicado
				System.out.println("un char");
				break;
			default: 
				System.out.println("default");
		}
	}
}