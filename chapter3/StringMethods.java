public class StringMethods {
	public static void main(String... args) {

		//Ejemplo 1
		StringMethods.testingCharAt();
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
		System.out.println(aString.charAt(7));		//Excepción en TIEMPO DE EJCUCIÖN (SI COMPILA) porque está fuera de rango
	}

}