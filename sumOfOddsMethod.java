/******************************************************************************

 Write a Java recursive method to find the sum of all odd numbers in an array.

*******************************************************************************/
public class Main
{
    static int addOdds(int [] odds){
        int sum = 0;
        
	    for(int i = 0; i < odds.length; i++){
	        if(odds[i] % 2 == 1){
	            sum = sum + odds[i];
	        }
	    } return sum;
    }
    


	public static void main(String[] args) {
	    
	    int [] oddNumbers = new int [] {1, 2, 3, 4, 5, 6, 7, 8};  
	   
	    System.out.println("Sum of odd numbers in  array: " + addOdds(oddNumbers));
	}
}
