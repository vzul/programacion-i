/******************************************************************************

Print the sum of the first 100 numbers.

*******************************************************************************/
public class Main
{
    static int sum (int num){
        
        
        if (num == 1) {
            return 1;
        } else {
            return num + sum(num - 1);
            
        }
       
            
    
    }
	
	public static void main(String[] args) {
	   
	   
	   System.out.println("Sum of first 100 numbers: " + sum(100));
	   
	}
}
