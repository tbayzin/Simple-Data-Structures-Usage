public class StringArrayBasic {

	public static void main(String[] args) {
		
		// Here we declared a String array with 5 football players initialized.
		String[] players = {"Messi","Ronaldo","Ronaldinho","Maradona","Pepe"};
		
		
		// Below we print the element at position 2 in the array. Note array starting to count from 0.
		// So 0.Messi, 1.Ronaldo and 2. will be Ronaldinho
		System.out.println(players[2]);
		
		
		// With  "players.length" code we get the length of the array which is 5. Array contains 5 elements.
		// U can get the int arrays length too with this method.
		System.out.println("The length of the array is " + players.length );
		
		
		   // And here we iterate the array 
        for (int i=0;i < players.length; i++) {
            
            System.out.println(players[i]);
        }
	}

}
