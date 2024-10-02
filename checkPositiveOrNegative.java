/******************************************************************************

Get a number from the user and print whether it is positive or negative.

*******************************************************************************/
public class Main
{
    static String check(int num){
        if (num > 0) {
            return "Postive";
        } else if (num == 0) {
            return "0";
        } else {
            return "Negative";
        }
    }
     
	public static void main(String[] args) {
	   
		System.out.println("-5?  " + check(-5));
		
	}
}
