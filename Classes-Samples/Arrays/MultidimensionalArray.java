package Arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		/*Here in this class we will intitialize and print our 2D and 3D arrays.
		 */
	
		// Creating and initializing our array values. This is 2D array.
		int[][] multiarray = {{15,20,40,50},{25,25,40,56}};
		
	
	    // Creating for each loop for iterating our multidimensional array.
		for (int[] innerArray: multiarray) {
	        for(int data: innerArray) {
	           System.out.println("This is 2D array " + data);
	        }

	}
		
		 // Initialized 3D array. Here we have 3 { }
	     int[][][]  treedimensional = {{{5,10,15},{50,100,150},{200,250,280}}};
	     
	     
	     // Iterating our 3D array.
	     for (int[][] array2D: treedimensional) {
	         for (int[] array1D: array2D) {
	            for(int item: array1D) {
	               System.out.println("Here is our 3D array " + item);
	            }
	         }
	      }

} }
