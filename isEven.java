/******************************************************************************

An expression which evaluates to true if an integer number n is even and false otherwise

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    static boolean isEven(int n){
        return n % 2 == 0;
    }
    
	public static void main(String[] args) {
	    
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter integer: ");
	    
	    String userInput = myObj.nextLine();
	    try {
	         int n = Integer.parseInt(userInput); // conversion to int
	         System.out.println("Is the number even? " + isEven(n));
	    } catch (NumberFormatException e){
	         System.out.println("Invalid input. Please enter a valid integer.");
	        
	    }
		
	}
}
