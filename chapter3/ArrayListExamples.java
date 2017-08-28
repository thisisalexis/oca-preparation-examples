import java.util.ArrayList;

public class ArrayListExamples {
	public static void main(String... args) {

		ArrayListExamples.add(); //Add examples
		ArrayListExamples.remove(); //Remove examples
	}

	//Method add
	public static void add() {
		System.println.

		//A list where we do not specify types that can contain de ArrayList (We could put any Object there, never primitives)
		ArrayList list = new ArrayList();
		list.add("hawk"); 						//[hawk]
		list.add( Boolean.TRUE );					//[hawk, true]
		System.out.println(list);

		//A list where we specify the type the list can cotain
		ArrayList<String> birds = new ArrayList<>();
		birds.add("hawk");			//[hawk] ------> Add it to the end of the list
		birds.add(1, "robin");		//[hawk, robin]
		birds.add(0, "blue jay");	//[blue jay, hawk, robin]
		birds.add(1, "cardinal");	//[blue jay, cardinal, hawk, robin]
		System.out.println( birds );
	}

	public static void remove() {
		ArrayList<String> birds = ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");

		System.out.println( birds.remove("cardinal") );		//False
		System.out.println( birds.remove("hawk") );			//true
		System.out.println( birds.remove(0) );				//hawk
		System.out.println( birds );		//[]
		
	}

	//Es como un update, reemplaza un elemento existente por otro
	public static set() {
		List<String> birds = new ArrayList<>();

		birds.add("hawk");
		birds.set(0, "robin");
		//birds.set(10, "cardinal");		//IndexOutOfBoundException
	}

	public static clear() {}

}