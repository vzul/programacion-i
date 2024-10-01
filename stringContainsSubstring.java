/******************************************************************************

Test if a given string contains the specified sequence of char values.

*******************************************************************************/
public class Main
{
     
	public static void main(String[] args) {
	   
		String str = new String("Hello world");
		String substr = new String("ello");
		
		System.out.println("Contains sequence?  " + str.contains(substr));
		
	}
}
