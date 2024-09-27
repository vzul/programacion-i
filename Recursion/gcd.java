/******************************************************************************

Write a Java recursive method to find the greatest common divisor (GCD) of two numbers.

*******************************************************************************/
public class Main
{
    static int gcd(int n, int m){
        if(m == 0){
            return n;
        } 
     return gcd(m, n % m) ;
        
    
    } 
    
	public static void main(String[] args) {
	    
        int x = 24;
        int y = 18;
	    System.out.println("GCD: " + gcd(x,y));
	   
	}
}
