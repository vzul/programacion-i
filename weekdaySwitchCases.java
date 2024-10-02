/******************************************************************************

Number from the user and generates an integer between 1 and 7. It displays the weekday name.

*******************************************************************************/
public class Main
{
	static String weekday(int num){
	switch(num){
	   case 1: return "Monday";
	   case 2: return "Tuesday";
	   case 3: return "Wednesday";
	   case 4: return "Thursday";
	   case 5: return "Friday";
	   case 6: return "Saturday";
	   case 7: return "Sunday";
	  default: return "Error";
	    }
	}
	 
	public static void main(String[] args) {
	   

		System.out.println("Day of the week: " + weekday(7));
		
	}
}
