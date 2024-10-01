/******************************************************************************

Get the character at the given index within the string.
-> Remember: count starts at 0.

*******************************************************************************/
public class Main
{
	// METHOD 1: CONVERTING STRING TO CHAR ARRAY
    static int getChar(char target, char [] strAux){
      
        for (int i = 0; i < strAux.length; i++){
             if (target == strAux[i]) {
                 return i;
             }
        } return -1;
    } 

	// METHOD 2: USING .CHARAT METHOD

static char getChar2(String strAux, int position){
      return strAux.charAt(position);
    } 

	// METHOD 3: RETURNING ASCII NUMBER 

   static int getChar3(String strAux, int position){
      int index1 = strAux.charAt(position);
      return index1;
    } 
     
     
    
	public static void main(String[] args) {
	    char letter = 'w';
		String str =  new String("Hello world");
		char[] charArray = str.toCharArray();
		System.out.println("Index of e: " + getChar(letter, charArray));

		System.out.println("Char at position 0: " + getChar2(str, 0));
		System.out.println("Char at position 10: " + getChar2(str, 10))
	}
}
