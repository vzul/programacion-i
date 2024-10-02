/******************************************************************************

Solve a quadratic equation. x = (-b +- sqrt(b^2 - 4ac)) / (2a)

*******************************************************************************/
public class Main
{
	static double[] result(double a, double b, double c){
	 double result1, result2;
	 double discriminant = Math.pow(b, 2) - 4 * a * c;
	 result1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	 result2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	 return new double[]{result1, result2};
	}
	 
	public static void main(String[] args) {
	   
	   // x^(2)-5x+6=0
		double[] solutions = result(1, -5, 6);
		System.out.println("Solutions of the equations:  " + solutions[0] + " and " + solutions[1]);
		
	}
}
