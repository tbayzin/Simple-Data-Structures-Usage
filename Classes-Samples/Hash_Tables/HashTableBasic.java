package HashTable;

import java.util.Hashtable;

public class HashTableBasic {

	public static void main(String[] args) {
		/*
		 * Here in this class we are going to create a simple hashtable and just print some elements inside.
		 */

		
		// Below we create a Hashtable with Integer-key and String-value.
		Hashtable <Integer,String> OurHashTable = new Hashtable <Integer,String>();
		
		
		// Assigning values with Integer(Numbers) key and String(Countries) value 
		// NOTE: We can create the opposite String key- Int value hashmaps too as well.
		OurHashTable.put(1, "England");
		OurHashTable.put(2, "Germany");
		OurHashTable.put(3, "Brazil");
		
   


		// Press the Hashtable elements to screen.
		System.out.println(OurHashTable);
		
	}

}
