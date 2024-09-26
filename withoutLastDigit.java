/******************************************************************************

An expression which, given an integer number, returns that number without the last digit, for instance, if the number is 345, it should evaluate to 34

*******************************************************************************/
public class Main
{
    static int withoutLastDigit(int n){
        return n / 10;
    }
    
	public static void main(String[] args) {
	    
	    int x = 345;
	    System.out.println("Without last digit: " + withoutLastDigit(x));
	   
		
	}
}
