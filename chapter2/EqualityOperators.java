public class EqualityOperators {
	public static void main(String... args) {
		boolean y = false;
		boolean x = ( y = true ); //true
		System.out.println("The value of x is " + x);
	}
}