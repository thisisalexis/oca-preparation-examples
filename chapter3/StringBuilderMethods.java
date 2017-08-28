public class StringBuilderMethods {

	public static void main(String... args) {

		//Example insertMethod
		StringBuilderMethods.insertMethod();
		//Example delete and deleteChartAt()
		StringBuilderMethods.deleteMethod();
	}

	//Example insert
	public static void insertMethod(){
		StringBuilder sb = new StringBuilder("Animals");
		sb.insert(-7,"_AT_THE_END");				
		System.out.println(sb);					//Animals_AT_THE_END
	

		//TRICKY!!!!
		//sb.insert(20,"_AT_THE_END");			//Exception StringOutOfBoundException	
	}

	public static void deleteMethod() {

		StringBuilder sb = new StringBuilder("abcdef");

		sb.delete(1,3);	//adef

	}

}