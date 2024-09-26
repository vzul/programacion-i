/******************************************************************************

An expression that converts Fahrenheit to Celsius

*******************************************************************************/
public class Main
{
    static double tempConverter(double fahrenheit){
        return (fahrenheit - 32.0) * (5.0/9.0);
    }
    
	public static void main(String[] args) {
	    
	    double x = 62.6;
	    System.out.println("In celsius: " + tempConverter(x));
	   
		
	}
}
