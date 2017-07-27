class ExampleLong {

	public static void main(String[] args) {
		//long max = 3123456789; --> Esto producirìa un error, porque el literal 3123456789 java lo declara como un int y ese número excede la capacidad de un int (32 bits). 
		long max = 3123456789L; //--> En ese caso, si al literal se le agrega la L, java asume que es un long (64 bits) y no un int, por lo que si compila
		System.out.println(max);
	}

}