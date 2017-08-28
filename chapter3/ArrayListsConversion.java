import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class ArrayListsConversion {

	public static void main(String... args) {

		//Example one: converting from an ArrayList to an Array
		ArrayListsConversion.ListToArray();

		//example two: converting from an array to a List
		ArrayListsConversion.ArrayToList();
	}

	public static void ListToArray(){

		ArrayList<String> list = new ArrayList<>();

		list.add("hawk");
		list.add("robin");
		list.add("cardinal");

		for(String str : list)
			System.out.println(str);

		Object[] objectArray = list.toArray();						//Defaults to an array of objects
		String[] stringArray = list.toArray( new String[0] );		//Defalts to an array of strings

		for( String str : stringArray )
			System.out.println(str.toUpperCase());

		for(int i = 0; i < objectArray.length; i++)
			System.out.println( ((String) objectArray[i]).toLowerCase() );

	}


	//Converting from an existing array to a List
	public static void ArrayToList() {
		String[] array = new String[] {"hawk", "robin"};

		List<String> list = Arrays.asList( array );			//Returns a fixed list

		System.out.println( list.size() );
	}

}