// Author: Viviana Zuloaga

public class Lab2 {
	
	//4 
	static final double PI = 3.14159265;
	public static void main (String [] args) {
	
	// 2
	System.out.println("Operations");
	int x = 20, y= 30;
	boolean z = true, a = false;
	System.out.println(x + y);
	System.out.println(x != y);
	System.out.println(z && a);
	
	// 3
	System.out.println("Declare and initialize char");
	char uno = 'u';
	System.out.println(uno);
	
	// 5
	System.out.println("Area of a circle");
	int radius = 3 ;
	System.out.println(2*PI*radius);
	
	/* 6 
	Años divisibles por 4 -> bisiesto
	Años divisibles por 100 -> no bisiesto
	Años divisibles por 400 -> bisiesto
	*/
	System.out.println("Leap year");
	int leapYear = 2024;
	System.out.println(leapYear  % 4 == 0 && ((leapYear % 100 != 0) || leapYear % 400 == 0 ));
	
	
	// 7
	System.out.println("Last digit");
	int ejemplo = 425;
	System.out.println(ejemplo % 10);
	
	// 8
	System.out.println("Without the last digit");
	System.out.println(ejemplo % 383);
	
	// 9 
	System.out.println("Multiplication of doubles");
	
	int c = 13, d = 10;
	System.out.println(c*d);
	
	
	
	}
}