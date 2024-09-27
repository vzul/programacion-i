/******************************************************************************

Calculate the nth Fibonacci number.

*******************************************************************************/
public class Main
{
    static int fibonacci(int n){
        
        // Base case
        
        
        if(n == 0){
            return 0;
        } else if(n == 1) {
            return 1;
        }
        
        return fibonacci (n-1) + fibonacci (n-2);
    
    } 
    
	public static void main(String[] args) {
	    
	    int x = 7;
	    System.out.println("Fibonacci term: " + fibonacci(x));
	   
	}
}
