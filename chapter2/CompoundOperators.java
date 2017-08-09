class CompoundOperators {
	public static void main(String[] jajaja) {
		long x = 10;
		int y = 5;
		//y = y * x; //The code won't compile, because the result of the right is a long and it fails to save it on the int in the left
		y *= x; //It works! The result of the left is as long, but the compiler cast it to the type in the left (int)
		System.out.println(y);

	}
}