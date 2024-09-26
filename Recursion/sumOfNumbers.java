/******************************************************************************

Calculate the sum of all numbers from 1 to n

*******************************************************************************/
public class Main
{
    static int sumOf(int n){
        
        if(n == 0){
            return 0;
        } else {
            return n + sumOf(n-1);
        }
    }
    
	public static void main(String[] args) {
	    
	    int x = 7;
	    System.out.println("Sum of numbers: " + sumOf(x));
	   
	}
}
