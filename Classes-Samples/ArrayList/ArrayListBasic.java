package ArrayList;

import java.util.ArrayList;

public class ArrayListBasic {

	public static void main(String[] args) {
	
		/* Here in this class we will declare,initialize and add-remove operations in an arraylist.
		 * This is very basic usage of an arraylist.
		 */
		
		// Here we create an arraylist with name fruits
		ArrayList<String> fruits = new ArrayList<String>(); 
		
		// Initialized elements to our Arraylist
		fruits.add("apple");
		fruits.add("avocado");
		fruits.add("lemon");

		
		// Print our fruit elements
		System.out.println("Fruit arraylist elements:  " + fruits);
		
		// Remove index number 0 which is apple
		fruits.remove(0);
		// Remove the element which displayed between quotes.
		fruits.remove("lemon");
		
		// Since we removed apple and lemon it will only show avocado 
		System.out.println("Fruit arraylist elements after  after we removed apple and lemon:  " + fruits);

	}

}
