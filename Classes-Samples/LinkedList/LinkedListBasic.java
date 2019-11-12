import java.util.LinkedList;

public class LinkedListBasic {

	public static void main(String[] args) {
	
		// In this class we declare a Linkedlist, add-remove elements into it,get size of the Linkedlist
		
		
		// We create a String type linkedlist with name of "countries"
		LinkedList<String> countries = new LinkedList<String>(); 
		
		  
        // Adding country elements to our linkedlist
		countries.add("Japan"); 
		countries.add("China"); 
		countries.addLast("Korea"); 
		countries.addLast("Korea"); 
        
		// Printing our linkedlist to screen
        System.out.println("Our linked list contains :  " + countries); 
        
        
        
        
        // Removing first element Japan
        countries.removeFirst(); 
        // Removing last element Korea
        countries.removeLast(); 

        // Now we print our linkedlist but since we removed Japan and Korea there will be only China and Brazil in the list.
        System.out.println("Our linked list contains after removed first and last  :  " + countries); 
        
        //Now we remove the element China
        countries.remove("China"); 
        
        // Finally only left one element in our Linkedlist which is Brazil
        System.out.println("Our linked list contains after removed China :  " + countries); 

        // Getting size of the linkedList
        int sizeoftheLinkedList = countries.size();
        
        // Since we removed 3 countries from our 4 elements linkedlist it will show 1 element as size of our linkedlist which is Brazil,remains in our linkedlist.
        System.out.println("Size of the linked list is:  " + sizeoftheLinkedList);

	}

}
