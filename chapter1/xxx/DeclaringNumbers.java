public class DeclaringNumbers {
	//int amount = 9L; DOES NOT COMPILE
	byte someByte = 125;
	double shotVariable = 999999999999D;
	long amount2 = 10;

	float floatVarWithoutF = 2.0F;
	
	float amountFloat = 10L;
	float floatWithoutDecimalPoint = 5000;
	double amountDouble = 10F;
	public static void main(String[] args) {
		int separatorInt = 10______10;
		float hxInt = 0xF;
		System.out.println("printing literal 10______10: " + separatorInt);
		System.out.println("Print 0xF numeric literal (hex): " + hxInt );
	}
}

class AnotherClassInTheFile {
	public static void main(String... args){
		System.out.println("Hello from AnotherClassInTheFile");
	}
}