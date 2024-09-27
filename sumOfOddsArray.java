/******************************************************************************

 Write a Java recursive method to find the sum of all odd numbers in an array.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    int [] oddNumbers = new int [] {1, 2, 3, 4, 5, 6, 7, 8};  
	    int sum = 0;
	    
	    for(int i = 0; i < oddNumbers.length; i++){
	        if(oddNumbers[i] % 2 == 1){
	            sum = sum + oddNumbers[i];
	        }
	    } 
	    
	   
	    System.out.println("Sum of odd numbers in  array: " + sum);
	}
}
