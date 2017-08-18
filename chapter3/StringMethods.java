public class StringMethods {
	public static void main(String... args) {

		//Ejemplo charAt()
		StringMethods.testingCharAt();
		
		//Ejemplo indexOf
		StringMethods.testingIndexOf();
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

		System.out.println( ">>>>>>>>>>>>EJEMPLO indexOf >>>>>>>>>>>>>>>>>" );
		
		System.out.println( name.indexOf('a') );	//0
		System.out.println( name.indexOf("al") );	//5
		System.out.println( name.indexOf('a', 4) );	//5
		System.out.println( name.indexOf("al", 6) );//-1 NO LO ENCUENTRA
				
			
	}

}