public class IncrementDecrementOperators {
	public static void main(String[] asd) {
		
		//Example one
		int counter = 0;
		System.out.println(counter);	//0
		System.out.println(++counter);	//1
		System.out.println(counter);	//1
		System.out.println(counter--);	//1
		System.out.println(counter);	//0


		//Example two
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		/*
		Por orden de precedencia, todos los incrementos y decrementos son
		resueltos primero, de izquierda a derecha.
		Luego las umtiplicaciones y divisiones de izquierda a derecha
		Por último las sumas.
		a) 4 * 5 / 4 + 2
		b) 20 / 4 + 2
		c) 5 + 2
		d) Y = 7
		*/
		
		System.out.println("The value ox X now is: " + x);
		System.out.println("The expression y = ++x * 5 / x-- + --x equals to: " + y);


	} 
}