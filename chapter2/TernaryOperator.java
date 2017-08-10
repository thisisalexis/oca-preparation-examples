public class TernaryOperator {

	public static void main(String[] a) {
		//Example one
		int y = 10;
		int x = (y > 5) ? (2*y) : (3*y);
	
		//Example two
		System.out.println( (y > 5) ? 21 : "Zebra" );	//Both expressions return different types, but it is valid since the method can handle it

		//Example three
		//int animal = ( y < 91 ? 9 : "Zebra" );		//The code won't compile!

		//Example four
		//int animal = ( y < 91 ? 9 : 9.0F );			//It DOES NOT compile, since the result is a float

		//Example five
		int animal = (int)( y < 91 ? 9 : 9.0 );			//It works!

		//Tricky examples
		TernaryOperator.trickyOneExample();
		TernaryOperator.trickyTwoExample();

	}

	public static void trickyOneExample() {
		//tricky example
		int y = 1, z = 1;
		final int x = y<10 ? y++ : z++;
		System.out.println(y + ", " + z);	//Outputs 1,2... Only the first part is executed (short circuit)
	}

	public static void trickyTwoExample() {
		//tricky example
		int y = 1, z = 1;
		final int x = y>=10 ? y++ : z++;
		System.out.println(y + ", " + z);	//Outputs 2,1... Only the second part is executed (short circuit)
	}

}