import java.util.Random;
import java.util.Scanner;  
import java.util.*;


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){

        Scanner a = new Scanner(System.in);
		// Create a Scanner object  
        //String input=scan.nextLine();	 
    	// Read user input

        //use hasNextDouble to check if input is numeric,

        if(a.hasNextDouble()){
            int input= a.nextInt();
            if(input == rnd_number){
                System.out.println("you are correct");
            }else{if(input < rnd_number){
                System.out.println("The correct number is higher");
            }else {
                System.out.println("the correct number is lower");

            }
            makeAGuess();
        }


}else{
    System.out.println("that aint a number");
}

        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

}


}