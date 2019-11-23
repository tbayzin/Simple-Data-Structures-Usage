import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedList {

	public static void main(String[] args) {
		// Here in this class we will iterate our linkedlist with 3 different ways.
				
		
		
		LinkedList<String> countries = new LinkedList<String>(); 
		
		
        // Adding country elements to our linkedlist
		countries.add("India"); 
		countries.add("China"); 
		countries.addLast("Korea"); 
		countries.addLast("Japan"); 
		
		
		//Firstly Java 8 loop option which is the simpliest option. 
		countries.forEach(System.out::println);
		
		//listIterator option
		ListIterator<String> listIterator = countries.listIterator();
		while (listIterator.hasNext())  {
			System.out.println("This is with ListIterator option  " + listIterator.next());
		}
		
		// For loop option.
		for (int i=0; i<countries.size();i++) {
			System.out.println("This is with For loop option" + countries.get(i));
		}

	}

}
