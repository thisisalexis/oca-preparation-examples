public class StringMethods {
	public static void main(String... args) {

		//Ejemplo charAt()
		StringMethods.testingCharAt();
		
		//Ejemplo indexOf
		StringMethods.testingIndexOf();

		//Ejemplo subString
		StringMethods.testingSubString();

		//Ejemplo startsWith() y endsWith()
		StringMethods.testingStartsAndEndsWith();
	}

	public static void testingCharAt(){
		String aString = "animals";

		System.out.println(aString.charAt(0));		//a
		System.out.println(aString.charAt(1));		//n
		System.out.println(aString.charAt(2));		//i
		System.out.println(aString.charAt(3));		//m
		System.out.println(aString.charAt(4));		//a
		System.out.println(aString.charAt(5));		//l
		System.out.println(aString.charAt(6));		//s
		//System.out.println(aString.charAt(7));		//Excepción en TIEMPO DE EJCUCIÖN (SI COMPILA) porque está fuera de rango
	}

	//Ejemplo de variantes de indexOf
	public static void testingIndexOf(){
		String name = "animnals";

		System.out.println( ">>>>>>>>>>>>EJEMPLO indexOf() >>>>>>>>>>>>>>>>>" );
		
		System.out.println( name.indexOf('a') );	//0
		System.out.println( name.indexOf("al") );	//5
		System.out.println( name.indexOf('a', 4) );	//5
		System.out.println( name.indexOf("al", 6) );//-1 NO LO ENCUENTRA
	}

	//ejemplos con substr
	public static void testingSubString() {

		String name = "animals";

		System.out.println( ">>>>>>>>>>>>EJEMPLO substr() >>>>>>>>>>>>>>>>>" );
		System.out.println( name.substring(3) );						//mals
		System.out.println( name.substring( name.indexOf('m') ) );		//mals
		System.out.println( name.substring(3, 4) );						//m
		System.out.println( name.substring(3, 7) );						//mals TRICKYYYYYYY
		System.out.println( name.substring(3, 3) );						//NADAAAAAA
		//System.out.println( name.substring(3, 2) );						//Exception
		//System.out.println( name.substring(3, 8) );						//Exception

	}

	public static void testingStartsAndEndsWith() {
		String name = "abc";

		System.out.println( ">>>>>>>>>>>>EJEMPLO startsWith() y endsWith() >>>>>>>>>>>>>>>>>" );
		System.out.println( name.startsWith("a") );					//true
		System.out.println( name.startsWith("ab") );				//true
		System.out.println( name.startsWith("abc") );				//true
		System.out.println( name.startsWith("abcdefg") );			//false
		
		System.out.println( name.endsWith("c") );					//true
		System.out.println( name.endsWith("bc") );					//true
		System.out.println( name.endsWith("abc") );					//true
					

	}



	01080270930100066938

}