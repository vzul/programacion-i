/******************************************************************************

Get the character at the given index within the string.
-> Remember: count starts at 0.

*******************************************************************************/
public class Main
{
    static int getChar(char target, char [] strAux){
      
        for (int i = 0; i < strAux.length; i++){
             if (target == strAux[i]) {
                 return i;
             }
        } return -1;
    } 
     
    
	public static void main(String[] args) {
	    char letter = 'w';
		String str =  new String("Hello world");
		char[] charArray = str.toCharArray();
		System.out.println("Index of e: " + getChar(letter, charArray));
	}
}
