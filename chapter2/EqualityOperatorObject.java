public class EqualityOperatorObject {
	public static void main(String... args) {
		 String x = new String("Hello");
		 String y = new String("Hello");
		 String z = x;

		 System.out.println(x == y);	//false
		 System.out.println(x == z);	//true
	}
}