/******************************************************************************

An expression which evaluates to true if an integer number n is a multiple of an integer number m

*******************************************************************************/
public class Main
{
    static boolean isMultiple(int n, int m){
        return n % m == 0;
    }
    
	public static void main(String[] args) {
	    
	    int x = 32;
	    int y = 15;
	    System.out.println("Is it a multiple? " + isMultiple(x,y));
	   
		
	}
}
