/******************************************************************************

Find the maximum element in an array.

*******************************************************************************/
public class Main
{
    static int findMax (int [] myarray){
        int max = 0;
        for(int i = 0; i < myarray.length; i++){
           if (myarray[i] > max){
               max = myarray[i];
           }
        } return max;
    }
    
	public static void main(String[] args) {
	    
	    int [] myArray = new int []{43, 2, 192, 31, 12, 897, 200, 8145};
		System.out.println("Max element of array: " + findMax(myArray));
	}
}
